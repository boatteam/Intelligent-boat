package edu.zust.boatserver.controller;

import edu.zust.boatserver.dto.BoatDto;
import edu.zust.boatserver.service.BoatDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/13 14:55
 * @description：小船数据控制器
 */

@RestController
@RequestMapping("/boat")
public class BoatDataController {
    @Resource
    BoatDataService boatDataService;

    @RequestMapping("/all_boat")
    public List getAllBoat(){
        List<BoatDto> allBoatList = boatDataService.getAllBoat();
        System.err.println(allBoatList.size());
        return allBoatList;
    }


}
