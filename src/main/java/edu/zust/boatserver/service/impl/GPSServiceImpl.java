package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.BoatRepository;
import edu.zust.boatserver.dao.GPSRepository;
import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.domain.GPS;
import edu.zust.boatserver.dto.GPSInfo;
import edu.zust.boatserver.service.GPSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HASEE on 2019/9/16 23:16
 */
@Service
@Slf4j
@Transactional
public class GPSServiceImpl implements GPSService {

    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private GPSRepository gpsRepository;

    @Override
    public GPSInfo addGPS(GPSInfo gpsInfo) {
        GPS gps = new GPS();
        if(gpsInfo!=null){
            BeanUtils.copyProperties(gpsInfo,gps);
            Boat boat = boatRepository.getOne(gpsInfo.getBoatId());
            gps.setBoat(boat);
            gpsRepository.save(gps);
        }
        if (gps.getId()!=null){
            gpsInfo.setId(gps.getId());
            return gpsInfo;
        }
        return null;
    }
}
