package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.BoatRepository;
import edu.zust.boatserver.dao.GPSRepository;
import edu.zust.boatserver.dao.PHRepository;
import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.domain.GPS;
import edu.zust.boatserver.domain.PH;
import edu.zust.boatserver.dto.BoatData;
import edu.zust.boatserver.dto.PHInfo;
import edu.zust.boatserver.service.PHService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HASEE on 2019/9/16 23:31
 */
@Service
@Transactional
@Slf4j
public class PHServiceImpl implements PHService {

    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private GPSRepository gpsRepository;

    @Autowired
    private PHRepository phRepository;

    @Override
    public void addPH(PHInfo phInfo) {
        PH ph = new PH();
        if (phInfo!=null){
            BeanUtils.copyProperties(phInfo, ph);
            Boat boat = boatRepository.getOne(phInfo.getBoatId());
            GPS gps = gpsRepository.getOne(phInfo.getGpsId());
            ph.setBoat(boat);
            ph.setGps(gps);
            phRepository.save(ph);
        }
    }

    @Override
    public List<BoatData> getAllPoints(Integer boatId) {
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        List<PH> phList = phRepository.findAllByBoat(boatRepository.getOne(boatId));
        List<BoatData> boatDataList = new ArrayList<>();
        if (phList!=null){
            for (PH p: phList){
                BoatData boatData = new BoatData();
                boatData.setPH(p.getPhValue());
                boatData.setLongitude(p.getGps().getLongitude());
                boatData.setLatitude(p.getGps().getLatitude());
                boatData.setTimeStamp(sdf.format(p.getGps().getTimestamp()));
                boatDataList.add(boatData);
            }
            return boatDataList;
        }
        return boatDataList;
    }
}
