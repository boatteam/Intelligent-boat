package edu.zust.boatserver.service;

import edu.zust.boatserver.dto.BoatData;
import edu.zust.boatserver.dto.PHInfo;

import java.util.List;

/**
 * Created by HASEE on 2019/9/16 23:31
 */
public interface PHService {
    void addPH(PHInfo phInfo);
    List<BoatData> getAllPoints(Integer boatId);
}
