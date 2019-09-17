package edu.zust.boatserver.exception;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/14
 */
@Data
public class NameExistedException extends RuntimeException {
    private String name;
    public NameExistedException(String name) {
        this.name = name;
    }
}
