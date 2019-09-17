package edu.zust.boatserver.controller;

import edu.zust.boatserver.dto.BoatInfo;
import edu.zust.boatserver.dto.NewBoat;
import edu.zust.boatserver.exception.BoatExistedException;
import edu.zust.boatserver.res.JsonRes;
import edu.zust.boatserver.service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HASEE on 2019/9/15 22:36
 */
@RestController
@RequestMapping("boat")
public class BoatController {
    @Autowired
    BoatService boatService;

    @PostMapping("/add")
    public JsonRes addBoat(@RequestBody NewBoat newBoat){
        if (boatService.isExisted(newBoat)){
            throw new BoatExistedException(newBoat.getBoatCode());
        }
        BoatInfo boatInfo = boatService.addBoat(newBoat);
        if (boatInfo==null){
            return JsonRes.failure();
        }
        return JsonRes.success();
    }
}
