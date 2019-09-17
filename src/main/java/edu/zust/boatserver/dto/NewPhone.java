package edu.zust.boatserver.dto;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/15 13:09
 */
@Data
public class NewPhone {
    private Integer id;
    private String oldPhone;
    private String newPhone;
    private String code;
}
