package edu.zust.boatserver.exception;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/15 15:35
 */
@Data
public class EmailExistedException extends RuntimeException {
    private String email;
    public EmailExistedException(String email){
        this.email = email;
    }
}
