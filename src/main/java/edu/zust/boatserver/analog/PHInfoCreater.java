package edu.zust.boatserver.analog;

import edu.zust.boatserver.dto.PHInfo;
import org.springframework.stereotype.Component;

/**
 * 模拟折线图数据
 * Created by HASEE on 2019/9/16 22:05
 */
@Component
public class PHInfoCreater {
    public static PHInfo create(Integer boatId, Integer gpsId){
        PHInfo phInfo = new PHInfo();
        phInfo.setBoatId(boatId);
        phInfo.setGpsId(gpsId);
        Double ph = Math.random()*3 + 5;
        phInfo.setPhValue(ph);
        if (ph >= 7.0 && ph <= 8.0){
            phInfo.setWaterQuality("优");
        } else if(ph >= 6.0 && ph < 7.0){
            phInfo.setWaterQuality("良好");
        } else {
            phInfo.setWaterQuality("差");
        }
        return phInfo;
    }
}
