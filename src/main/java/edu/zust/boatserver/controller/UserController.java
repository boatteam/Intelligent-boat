package edu.zust.boatserver.controller;

import com.aliyuncs.exceptions.ClientException;
import edu.zust.boatserver.dto.*;
import edu.zust.boatserver.exception.*;
import edu.zust.boatserver.res.JsonRes;
import edu.zust.boatserver.service.MailService;
import edu.zust.boatserver.service.RedisService;
import edu.zust.boatserver.service.UserService;
import edu.zust.boatserver.util.AliSmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HASEE on 2019/8/20
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisService redisService;

    @Autowired
    private AliSmsUtil aliSmsUtil;

    @Autowired
    private MailService mailService;

    @PostMapping(value = "/login")
    public UserInfo login(@RequestBody LoginInfo loginInfo){
        if(!userService.isExisted(loginInfo)){
            throw new UserNotFoundException(loginInfo.getUsername());
        }
        UserInfo userInfo = userService.login(loginInfo);
        if(userInfo==null){
            throw new PasswordErrorException();
        }
        return userInfo;
    }

    @PostMapping(value = "/registerCode")
    public JsonRes getCode(@RequestBody RegInfo regInfo) throws ClientException {
        boolean send = aliSmsUtil.sendRegCode(regInfo.getPhone(), redisService.cacheCode(regInfo.getPhone()));
        if (!send){
            return JsonRes.failure();
        }
        return JsonRes.success();
    }

    @PostMapping(value = "/register")
    public JsonRes register(@RequestBody RegInfo regInfo){
        if (!regInfo.getCode().equals(redisService.getCode(regInfo.getPhone()))){
            throw new CodeErrorException();
        }
        if (userService.isExisted(regInfo.getPhone())) {
            throw new PhoneExistedException(regInfo.getPhone());
        }
        if (userService.isExisted(regInfo)){
            throw new NameExistedException(regInfo.getName());
        }
        if (!userService.register(regInfo)){
            return JsonRes.failure();
        }
        return JsonRes.success();
    }

    @PostMapping(value = "/pwdResetCode")
    public JsonRes getCode(@RequestBody ResetInfo resetInfo) throws ClientException {
        if(!userService.isExisted(resetInfo)){
            throw new UserNotFoundException(resetInfo.getUsername());
        }
        String phone = redisService.getPhone(resetInfo.getUsername());
        boolean send = aliSmsUtil.sendPwdCode(phone, redisService.cacheCode(phone));
        if(!send){
            return JsonRes.failure();
        }
        return JsonRes.success();
    }

    @PostMapping(value = "/resetPwd")
    public UserInfo reset(@RequestBody ResetInfo resetInfo){
        if(!userService.isExisted(resetInfo)){
            throw new UserNotFoundException(resetInfo.getUsername());
        }
        if (!resetInfo.getCode().equals(redisService.getCode(redisService.getPhone(resetInfo.getUsername())))){
            throw new CodeErrorException();
        }
        return userService.getByUsername(resetInfo);
    }

    /**
     * @Author HASEE
     * @Description 应该进行访问控制
     * @Date 2019/9/15 13:06
     * @Param [newPwd]
     * @return edu.zust.boatserver.res.JsonRes
     */
    @PostMapping(value = "/changePwd")
    public JsonRes changePwd(@RequestBody NewPwd newPwd){
        if (userService.updatePwd(newPwd)) {
            return JsonRes.success();
        }
        return JsonRes.failure();
    }


    @PostMapping(value = "/phoneChangeCode")
    public JsonRes getCode(@RequestBody NewPhone newPhone) throws ClientException {
        boolean send = aliSmsUtil.sendSecretChangeCode(newPhone.getNewPhone(), redisService.cacheCode(newPhone.getNewPhone()));
        if (!send){
            return JsonRes.failure();
        }
        return JsonRes.success();
    }

    @PostMapping(value = "/changePhone")
    public UserInfo changePhone(@RequestBody NewPhone newPhone){
        if (!newPhone.getCode().equals(redisService.getCode(newPhone.getNewPhone()))){
            throw new CodeErrorException();
        }
        if (userService.isExisted(newPhone.getNewPhone())) {
            throw new PhoneExistedException(newPhone.getNewPhone());
        }
        if (!userService.updatePhone(newPhone)){
            throw new UpdateErrorException();
        }
        return userService.getUserInfo(newPhone.getId());
    }

    @PostMapping(value = "/emailChangeCode")
    public JsonRes getCode(@RequestBody NewEmail newEmail){
        boolean send = mailService.sendEmailChangeCode(newEmail.getNewEmail(), redisService.cacheMailCode(newEmail.getNewEmail()));
        if (send){
            return JsonRes.success();
        }
        return JsonRes.failure();
    }

    @PostMapping(value = "/changeEmail")
    public UserInfo changeEmail(@RequestBody NewEmail newEmail){
        if (!newEmail.getCode().equals(redisService.getMailCode(newEmail.getNewEmail()))){
            throw new CodeErrorException();
        }
        if (userService.isExisted(newEmail)) {
            throw new EmailExistedException(newEmail.getNewEmail());
        }
        if (!userService.updateEmail(newEmail)){
            throw new UpdateErrorException();
        }
        return userService.getUserInfo(newEmail.getId());
    }
}
