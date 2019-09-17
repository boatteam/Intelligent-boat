package edu.zust.boatserver.exception;

import lombok.Data;

/**
 * Created by HASEE on 2019/8/20
 */
@Data
public class UserNotFoundException extends RuntimeException {

    private Integer id;
    private String username;

    public UserNotFoundException(Integer id, String username){
        this.id = id;
        this.username = username;
    }

    public UserNotFoundException(Integer id){
        this.id = id;
    }

    public UserNotFoundException(String username){
        this.username = username;
    }

}
