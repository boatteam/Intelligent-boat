package edu.zust.boatserver.exception;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/14
 */
@Data
public class PhoneExistedException extends RuntimeException {
    private String phone;

    public PhoneExistedException(String phone){
        this.phone = phone;
    }
}
