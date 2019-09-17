package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.BoatDataRepository;
import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.dto.BoatDto;
import edu.zust.boatserver.service.BoatDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/13 15:14
 * @description：小船数据业务类
 */
@Service
public class BoatDataServiceImpl implements BoatDataService {
    @Resource
    BoatDataRepository boatDataRepository;

    @Override
    public List getAllBoat() {
        List<Boat> boatList = boatDataRepository.findAll();
        List<BoatDto> boatDtoList = new LinkedList<>();
        if (boatList != null && boatList.size() > 0){
            Iterator iterator = boatList.iterator();
            while (iterator.hasNext()){
                BoatDto boatDTO = new BoatDto();
                BeanUtils.copyProperties(iterator.next(),boatDTO);
                boatDtoList.add(boatDTO);
            }
            return boatDtoList;
        }
        return null;
    }

}
