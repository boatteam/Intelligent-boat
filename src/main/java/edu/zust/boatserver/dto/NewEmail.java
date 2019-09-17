package edu.zust.boatserver.dto;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/15 13:11
 */
@Data
public class NewEmail {
    private Integer id;
    private String oldEmail;
    private String newEmail;
    private String code;
}
