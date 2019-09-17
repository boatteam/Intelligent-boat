package edu.zust.boatserver.analog;

import edu.zust.boatserver.dto.PHInfo;

/**
 * 模拟折线图数据
 * Created by HASEE on 2019/9/16 22:05
 */
public class PHInfoCreater {
    public static PHInfo create(Integer boatId, Integer gpsId){
        PHInfo phInfo = new PHInfo();
        phInfo.setBoatId(boatId);
        phInfo.setGpsId(gpsId);
        phInfo.setPhValue(Math.random()*14);
        return phInfo;
    }
}
