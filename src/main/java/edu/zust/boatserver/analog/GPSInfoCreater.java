package edu.zust.boatserver.analog;

import edu.zust.boatserver.dto.GPSInfo;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 模拟小船的数据
 * Created by HASEE on 2019/9/16 22:05
 */
@Component
public class GPSInfoCreater {
    private Double longitude = 120.030551;
    private Double latitude = 30.224074;

    public GPSInfo create(Integer boatId){
        GPSInfo gpsInfo = new GPSInfo();
        gpsInfo.setBoatId(boatId);
        gpsInfo.setTimestamp(new Date());
        gpsInfo.setLongitude(longitude);
        gpsInfo.setLatitude(latitude);
        return gpsInfo;
    }

    public Double getLongitude(){
        return longitude;
    }

    public Double getLatitude(){
        return latitude;
    }

    public void setLocation(GPSInfo gpsInfo) {
        this.longitude = gpsInfo.getLongitude();
        this.latitude = gpsInfo.getLatitude();
    }

    public void driveLeft() {
        longitude--;
    }

    public void driveRight(){
        longitude++;
    }

    public void driveUp(){
        latitude++;
    }

    public void driveDown(){
        latitude--;
    }
}
