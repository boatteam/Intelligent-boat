package edu.zust.boatserver.service;

import edu.zust.boatserver.dto.*;

/**
 * ${DESCRIPTION}
 * Created by HASEE on 2019/8/20
 */
public interface UserService {
    boolean isExisted(LoginInfo loginInfo);
    UserInfo login(LoginInfo loginInfo);
    boolean isExisted(String phone);
    boolean isExisted(RegInfo regInfo);
    boolean isExisted(ResetInfo resetInfo);
    boolean register(RegInfo regInfo);
    UserInfo getByUsername(ResetInfo resetInfo);
    boolean updatePwd(NewPwd newPwd);
    boolean updatePhone(NewPhone newPhone);
    UserInfo getUserInfo(Integer id);
    boolean isExisted(NewEmail newEmail);
    boolean updateEmail(NewEmail newEmail);
}
