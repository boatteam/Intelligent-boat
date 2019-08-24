package edu.zust.boatserver.controller;

import edu.zust.boatserver.exception.UserNotFoundException;
import edu.zust.boatserver.dto.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HASEE on 2019/8/17
 */
@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error userNotFound(UserNotFoundException e){
        String username = e.getUsername();
        return new Error(404, "User [" + username + "] not found");
    }

}
