package edu.zust.boatserver.service;

import edu.zust.boatserver.dto.BoatInfo;
import edu.zust.boatserver.dto.NewBoat;

/**
 * Created by HASEE on 2019/9/15 22:50
 */
public interface BoatService {
    boolean isExisted(NewBoat newBoat);
    BoatInfo addBoat(NewBoat newBoat);
}
