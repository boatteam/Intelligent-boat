package edu.zust.boatserver.service;

/**
 * Created by HASEE on 2019/9/14 19:59
 */
public interface RedisService {
    /**
     * @Author HASEE
     * @Description 
     * @Date 2019/9/14 20:14
     * @Param [key]
     * @return java.lang.String
     */
    String getCode(String phone);
    
    /**
     * @Author HASEE
     * @Description 
     * @Date 2019/9/14 22:27
     * @Param [phone]
     * @return java.lang.String
     */
    String cacheCode(String phone);

    /**
     * @Author HASEE
     * @Description
     * @Date 2019/9/14 23:50
     * @Param [username]
     * @return java.lang.String
     */
    String getPhone(String username);

    String cacheMailCode(String email);

    String getMailCode(String email);
}
