package edu.zust.boatserver.controller;

import edu.zust.boatserver.dto.UserInfo;
import edu.zust.boatserver.exception.UserNotFoundException;
import edu.zust.boatserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HASEE on 2019/8/20
 */
@RestController
@RequestMapping("/boat")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public UserInfo login(@RequestBody UserInfo userInfo){
        UserInfo userInfo1 = userService.login(userInfo);
        if(userInfo1 == null){
            throw new UserNotFoundException(userInfo.getUsername());
        }
        return userInfo1;
    }

}
