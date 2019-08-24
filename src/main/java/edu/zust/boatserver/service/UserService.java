package edu.zust.boatserver.service;

import edu.zust.boatserver.dto.UserInfo;

/**
 * ${DESCRIPTION}
 * Created by HASEE on 2019/8/20
 */
public interface UserService {
    UserInfo login(UserInfo userInfo);
}
