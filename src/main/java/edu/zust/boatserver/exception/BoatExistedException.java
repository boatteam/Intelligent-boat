package edu.zust.boatserver.exception;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/15 23:37
 */
@Data
public class BoatExistedException extends RuntimeException {
    private String boatCode;
    public BoatExistedException(String boatCode){
        this.boatCode = boatCode;
    }
}
