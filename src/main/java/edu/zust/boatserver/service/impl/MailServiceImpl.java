package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by HASEE on 2019/9/15 14:22
 */
@Service
@Slf4j
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public boolean sendEmailChangeCode(String to, String code) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("1635732237@qq.com");
        mailMessage.setTo(to);
        mailMessage.setSubject("Code from 无人水质监测平台");
        mailMessage.setText("Your code is: " + code);
        try {
            mailSender.send(mailMessage);
            return true;
        } catch (MailException e) {
            log.error("Mail Send Error");
            return false;
        }
    }
}
