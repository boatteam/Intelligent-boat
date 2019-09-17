package edu.zust.boatserver.service;

/**
 * Created by HASEE on 2019/9/15 14:23
 */
public interface MailService {
    public boolean sendEmailChangeCode(String to, String code);
}
