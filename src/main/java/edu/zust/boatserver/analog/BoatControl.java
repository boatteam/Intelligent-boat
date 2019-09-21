package edu.zust.boatserver.analog;

import com.alibaba.fastjson.JSON;
import edu.zust.boatserver.constant.Direction;
import edu.zust.boatserver.dto.BoatData;
import edu.zust.boatserver.dto.DirectionInfo;
import edu.zust.boatserver.dto.GPSInfo;
import edu.zust.boatserver.dto.PHInfo;
import edu.zust.boatserver.service.GPSService;
import edu.zust.boatserver.service.PHService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by HASEE on 2019/9/16 22:55
 */
@Component
@Slf4j
public class BoatControl {

    @Autowired
    private PHService phService;

    @Autowired
    private GPSService gpsService;

    @Autowired
    GPSInfoCreater gpsInfoCreater = new GPSInfoCreater();

    public String control(DirectionInfo directionInfo){
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        String direction = directionInfo.getDirection();
        Direction direction1 = Direction.valueOf(direction.toUpperCase());
        switch (direction1){
            case UP:
                gpsInfoCreater.driveUp();
                break;
            case DOWN:
                gpsInfoCreater.driveDown();
                break;
            case LEFT:
                gpsInfoCreater.driveLeft();
                break;
            case RIGHT:
                gpsInfoCreater.driveRight();
                break;
            case INIT:
                gpsInfoCreater.setLocation(gpsService.findLastGPS(directionInfo.getBoatId()));
                break;
            default:
        }
        GPSInfo gpsInfo = gpsInfoCreater.create(directionInfo.getBoatId());
        gpsInfo = gpsService.addGPS(gpsInfo);
        PHInfo phInfo = PHInfoCreater.create(directionInfo.getBoatId(), gpsInfo.getId());
        phService.addPH(phInfo);
        /*SocketInfo socketInfo = new SocketInfo();
        socketInfo.setName("direction");*/
        BoatData boatData = new BoatData();
        boatData.setTimeStamp(sdf.format(gpsInfo.getTimestamp()));
        boatData.setPH(phInfo.getPhValue());
        boatData.setLongitude(gpsInfo.getLongitude());
        boatData.setLatitude(gpsInfo.getLatitude());
        boatData.setBoatId(gpsInfo.getBoatId());
        boatData.setWaterQuality(phInfo.getWaterQuality());
        /*socketInfo.setBoatData(boatData);*/
        return JSON.toJSONString(boatData);
    }
}
