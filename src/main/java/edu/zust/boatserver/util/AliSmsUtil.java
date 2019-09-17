package edu.zust.boatserver.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by HASEE on 2019/9/14
 */
@Component
@Slf4j
public class AliSmsUtil {

    static final String PRODUCT = "Dysmsapi";
    static final String DOMAIN = "dysmsapi.aliyuncs.com";
    static final String SUCCESS = "OK";

    private boolean sendByTemplateId(String templateId, String phone, String templateParam) throws ClientException {
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FgUUxeCPEohiTKJ2KGL", "Z225DkzdpAfxQeAYjrCjFh1a1U4Ydd");

        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", PRODUCT, DOMAIN);

        IAcsClient acsClient = new DefaultAcsClient(profile);

        SendSmsRequest request = new SendSmsRequest();
        request.setPhoneNumbers(phone);
        request.setSignName("无人水质监测平台");
        request.setTemplateCode(templateId);
        if(templateParam!=null){
            request.setTemplateParam(templateParam);
        }
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        if ((sendSmsResponse.getCode() != null) && sendSmsResponse.getCode().equals(SUCCESS)) {
            // 代表请求成功
            return true;
        } else {
            return false;
        }
    }

    public boolean sendRegCode(String phone, String code) throws ClientException {
        return sendByTemplateId("SMS_174027758", phone, "{\"code\":\"" + code + "\"}");
    }

    public boolean sendPwdCode(String phone, String code) throws ClientException {
        return sendByTemplateId("SMS_174027930", phone, "{\"code\":\"" + code + "\"}");
    }

    public boolean sendSecretChangeCode(String phone, String code) throws ClientException {
        return sendByTemplateId("SMS_174027931", phone, "{\"code\":\"" + code + "\"}");
    }
}
