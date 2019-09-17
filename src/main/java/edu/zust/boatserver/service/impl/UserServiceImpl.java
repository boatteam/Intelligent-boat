package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.UserRepository;
import edu.zust.boatserver.domain.User;
import edu.zust.boatserver.dto.*;
import edu.zust.boatserver.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HASEE on 2019/8/20
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public boolean isExisted(LoginInfo loginInfo) {
        return userRepository.countByUsername(loginInfo.getUsername())==1;
    }

    @Override
    public UserInfo login(LoginInfo loginInfo) {
        User user = userRepository.findByUsername(loginInfo.getUsername(), loginInfo.getPassword());
        UserInfo userInfo = new UserInfo();
        if (user != null){
            BeanUtils.copyProperties(user, userInfo);
            return userInfo;
        }
        return null;
    }

    @Override
    public boolean isExisted(String phone) {
        return userRepository.countByPhone(phone)==1;
    }

    @Override
    public boolean isExisted(RegInfo regInfo) {
        return userRepository.countByName(regInfo.getName())==1;
    }

    @Override
    public boolean register(RegInfo regInfo) {
        User user = new User();
        if(regInfo != null){
            BeanUtils.copyProperties(regInfo, user);
        }
        user = userRepository.save(user);
        return user!=null;
    }

    @Override
    public boolean isExisted(ResetInfo resetInfo) {
        return userRepository.countByUsername(resetInfo.getUsername())==1;
    }

    @Override
    public UserInfo getByUsername(ResetInfo resetInfo) {
        User user = userRepository.findByUsername(resetInfo.getUsername());
        UserInfo userInfo = new UserInfo();
        if (user != null){
            BeanUtils.copyProperties(user, userInfo);
            return userInfo;
        }
        return null;
    }

    @Override
    public boolean updatePwd(NewPwd newPwd) {
        return userRepository.updatePassword(newPwd.getId(), newPwd.getPassword())==1;
    }

    @Override
    public boolean updatePhone(NewPhone newPhone) {
        return userRepository.updatePhone(newPhone.getId(), newPhone.getNewPhone())==1;
    }

    @Override
    public UserInfo getUserInfo(Integer id) {
        User user = userRepository.getOne(id);
        UserInfo userInfo = new UserInfo();
        if (user!=null){
            BeanUtils.copyProperties(user,userInfo);
            return userInfo;
        }
        return null;
    }

    @Override
    public boolean isExisted(NewEmail newEmail) {
        return userRepository.countByEmail(newEmail.getNewEmail())==1;
    }

    @Override
    public boolean updateEmail(NewEmail newEmail) {
        return userRepository.updateEmail(newEmail.getId(), newEmail.getNewEmail())==1;
    }
}
