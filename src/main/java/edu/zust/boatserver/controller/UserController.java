package edu.zust.boatserver.controller;

import edu.zust.boatserver.dto.UserInfo;
import edu.zust.boatserver.exception.UserNotFoundException;
import edu.zust.boatserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /*@Autowired
    private UserRepository userRepository;*/

    @RequestMapping(value = "/login")
    public UserInfo login(UserInfo userInfo){
        UserInfo userInfo1 = userService.login(userInfo);
        if(userInfo1 == null){
            throw new UserNotFoundException(userInfo.getUsername());
        }
        return userInfo1;
    }

    /*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public User findByUsername(UserInfo userInfo){
        return userRepository.findName(userInfo.getUsername());
    }*/

}
