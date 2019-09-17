package edu.zust.boatserver.controller;

import edu.zust.boatserver.dto.WaterQualityDataDto;
import edu.zust.boatserver.service.WaterQualityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/15 20:28
 * @description：水质数据控制器
 */

@RestController
@RequestMapping("/boat")
public class WaterQualityDataController {

    @Resource
    WaterQualityDataService waterQualityDataService;

    @RequestMapping("/home")
    List getHomePageWheelData(){
        List wheelDataList = waterQualityDataService.getHomePageData();
        return wheelDataList;
    }
}
