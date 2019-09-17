package edu.zust.boatserver.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by HASEE on 2019/8/20
 */
@Data
public class UserInfo {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Date birthday;
    private Date registDate;
    private String province;
    private String city;
}
