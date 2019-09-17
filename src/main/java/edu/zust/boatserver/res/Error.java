package edu.zust.boatserver.res;

import lombok.Data;

/**
 * Created by HASEE on 2019/8/20
 */
@Data
public class Error {

    private int code;
    private String message;

    public Error(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
