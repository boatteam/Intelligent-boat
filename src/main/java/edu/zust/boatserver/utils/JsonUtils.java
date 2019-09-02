package edu.zust.boatserver.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import edu.zust.boatserver.constant.CMDType;
import edu.zust.boatserver.dto.BoatDataInfo;
import edu.zust.boatserver.dto.DirectionInfo;
import edu.zust.boatserver.dto.LineDataInfo;

/**
 * Created by HASEE on 2019/8/29
 */
public class JsonUtils {
    public static String messageConvert(String payload){
        JSONObject jsonObject = JSON.parseObject(payload);
        String name = jsonObject.getString("name");
        CMDType cmdType = CMDType.valueOf(name.toUpperCase());
        switch (cmdType){
            case DIRECTION:
                DirectionInfo directionInfo = JSON.parseObject(payload, DirectionInfo.class);
                return JSON.toJSONString(directionInfo);
            case BOAT_DATA:
                BoatDataInfo boatDataInfo = JSON.parseObject(payload, BoatDataInfo.class);
                return JSON.toJSONString(boatDataInfo);
            case LINE_DATA:
                LineDataInfo lineDataInfo = JSON.parseObject(payload, LineDataInfo.class);
                return  JSON.toJSONString(lineDataInfo);
            case CANCEL:
                DirectionInfo directionInfoC = JSON.parseObject(payload, DirectionInfo.class);
                return JSON.toJSONString(directionInfoC);
            default:
                return "";
        }
    }
}
