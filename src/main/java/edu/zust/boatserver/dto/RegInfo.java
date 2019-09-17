package edu.zust.boatserver.dto;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/14
 */
@Data
public class RegInfo {
    private String name;
    private String password;
    private String password2;
    private String phone;
    private String code;
}
