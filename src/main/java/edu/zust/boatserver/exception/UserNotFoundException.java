package edu.zust.boatserver.exception;

/**
 * Created by HASEE on 2019/8/20
 */
public class UserNotFoundException extends RuntimeException {
    private long id;
    private String username;

    public UserNotFoundException(long id, String username){
        this.id = id;
        this.username = username;
    }

    public UserNotFoundException(String username){
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
