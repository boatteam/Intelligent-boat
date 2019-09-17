package edu.zust.boatserver.analog;

import com.alibaba.fastjson.JSON;
import edu.zust.boatserver.constant.Direction;
import edu.zust.boatserver.dto.*;
import edu.zust.boatserver.service.GPSService;
import edu.zust.boatserver.service.PHService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public String control(DirectionInfo directionInfo){
        GPSInfoCreater gpsInfoCreater = new GPSInfoCreater();
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
            default:
        }
        GPSInfo gpsInfo = gpsInfoCreater.create(directionInfo.getBoatId());
        gpsInfo = gpsService.addGPS(gpsInfo);
        PHInfo phInfo = PHInfoCreater.create(directionInfo.getBoatId(), gpsInfo.getId());
        phService.addPH(phInfo);
        SocketInfo socketInfo = new SocketInfo();
        List<BoatData> boatDataList = phService.getAllPoints(directionInfo.getBoatId());
        socketInfo.setName("direction");
        socketInfo.setBoatDataList(boatDataList);
        return JSON.toJSONString(socketInfo);
    }
}
