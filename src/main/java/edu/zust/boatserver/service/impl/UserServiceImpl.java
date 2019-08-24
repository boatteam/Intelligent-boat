package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.UserRepository;
import edu.zust.boatserver.domain.User;
import edu.zust.boatserver.dto.UserInfo;
import edu.zust.boatserver.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HASEE on 2019/8/20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfo login(UserInfo userInfo) {
        User user = userRepository.findUserByUsernameAndPassword(userInfo.getUsername(), userInfo.getPassword());
        if (user != null){
            BeanUtils.copyProperties(user, userInfo);
            return userInfo;
        }
        return null;
    }
}
