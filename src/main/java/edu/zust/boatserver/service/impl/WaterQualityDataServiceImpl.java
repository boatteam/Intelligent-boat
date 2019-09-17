package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.WaterQualityDataRepository;
import edu.zust.boatserver.dto.WaterQualityDataDto;
import edu.zust.boatserver.service.WaterQualityDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/15 16:41
 * @description：水质数据业务类
 */
@Service
public class WaterQualityDataServiceImpl implements WaterQualityDataService {

    @Resource
    WaterQualityDataRepository waterQualityDataRepository;

    @Override
    public List getHomePageData() {
        List waterQualityDataList = waterQualityDataRepository.getHomePageWaterQualityData();
        if (waterQualityDataList != null && waterQualityDataList.size() > 0){
            List<WaterQualityDataDto> waterQualityDataDtoList = new LinkedList<>();
            Iterator iterator = waterQualityDataList.iterator();
            Integer count = 1;
            while (iterator.hasNext()){
                Object[] objects = (Object[]) iterator.next();
                WaterQualityDataDto waterQualityDataDto = new WaterQualityDataDto();
                waterQualityDataDto.setId(count++);
                waterQualityDataDto.setLongitude((Double) objects[0]);
                waterQualityDataDto.setLatitude((Double) objects[1]);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = (Timestamp)objects[2];
                String formatDate = dateFormat.format(date);
                waterQualityDataDto.setDate(formatDate);
                waterQualityDataDto.setBoatId((Integer) objects[3]);
                waterQualityDataDto.setPhValue((Double) objects[4]);
                double ph = (double) objects[4];
                if (Math.abs(ph - 7.5) == 0){
                    waterQualityDataDto.setWaterQuality("优");
                }else if (6.5 < ph && ph < 8.5){
                    waterQualityDataDto.setWaterQuality("良好");
                }else if (ph < 6.5 || ph > 8.5){
                    waterQualityDataDto.setWaterQuality("差");
                }
                waterQualityDataDtoList.add(waterQualityDataDto);
            }
            return waterQualityDataDtoList;
        }

        return null;
    }
}
