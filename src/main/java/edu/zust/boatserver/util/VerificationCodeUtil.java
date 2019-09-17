package edu.zust.boatserver.util;

import java.util.Random;

/**
 * Created by HASEE on 2019/9/14
 * @author HASEE
 */
public class VerificationCodeUtil {
    public static String getRandomCode(){
        return String.valueOf(new Random().nextInt(9000) + 1000);
    }
}
