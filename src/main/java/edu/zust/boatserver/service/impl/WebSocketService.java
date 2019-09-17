package edu.zust.boatserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import edu.zust.boatserver.analog.BoatControl;
import edu.zust.boatserver.constant.CMDType;
import edu.zust.boatserver.dto.BoatDataInfo;
import edu.zust.boatserver.dto.DirectionInfo;
import edu.zust.boatserver.dto.LineDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HASEE on 2019/8/29
 */
@Service
public class WebSocketService {

    @Autowired
    private BoatControl boatControl;

    public String messageConvert(String payload){
        JSONObject jsonObject = JSON.parseObject(payload);
        String name = jsonObject.getString("name");
        CMDType cmdType = CMDType.valueOf(name.toUpperCase());
        switch (cmdType){
            case DIRECTION:
                DirectionInfo directionInfo = JSON.parseObject(payload, DirectionInfo.class);
                return boatControl.control(directionInfo);
            case BOAT_DATA:
                BoatDataInfo boatDataInfo = JSON.parseObject(payload, BoatDataInfo.class);
                return JSON.toJSONString(boatDataInfo);
            case LINE_DATA:
                LineDataInfo lineDataInfo = JSON.parseObject(payload, LineDataInfo.class);
                return  JSON.toJSONString(lineDataInfo);
            case CANCEL:
                DirectionInfo directionInfoCancel = JSON.parseObject(payload, DirectionInfo.class);
                return JSON.toJSONString(directionInfoCancel);
            default:
                return "";
        }
    }

}
