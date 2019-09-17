package edu.zust.boatserver.service;

import edu.zust.boatserver.domain.Boat;

import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/13 15:11
 * @description：小船数据业务类接口
 */
public interface BoatDataService {

    /**
     * @author iusugar
     * @date 2019/9/13 16:17
     * @description 获取数据库表中所有的小船信息
     * @return java.util.List
     */
    List getAllBoat();

}
