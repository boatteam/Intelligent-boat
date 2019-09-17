package edu.zust.boatserver.handler;

import edu.zust.boatserver.exception.*;
import edu.zust.boatserver.res.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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

    @ExceptionHandler(PasswordErrorException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error passwordError(PasswordErrorException e){
        return new Error(404, "Password Error");
    }

    @ExceptionHandler(PhoneExistedException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Error phoneExisted(PhoneExistedException e){
        return new Error(409, "Phone [" + e.getPhone() + "] already existed");
    }

    @ExceptionHandler(NameExistedException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Error nameExisted(NameExistedException e){
        return new Error(409, "Name [" + e.getName()+ "] already existed");
    }

    @ExceptionHandler(CodeErrorException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Error codeError(CodeErrorException e){
        return new Error(409, "Code Error");
    }

    @ExceptionHandler(UpdateErrorException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error updateError(UpdateErrorException e){
        return new Error(404, "Update Eooro");
    }

    @ExceptionHandler(EmailExistedException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Error emailExisted(EmailExistedException e){
        return new Error(409, "Email [" + e.getEmail() + "] already existed");
    }

    @ExceptionHandler(BoatExistedException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Error boatExisted(BoatExistedException e){
        return new Error(409, "Boat [" + e.getBoatCode() + "] already existed");
    }
}
