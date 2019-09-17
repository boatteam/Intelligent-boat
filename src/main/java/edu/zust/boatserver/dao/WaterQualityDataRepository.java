package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.domain.Ph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/15 16:45
 * @description：水质数据访问操作接口
 */
@Repository
public interface WaterQualityDataRepository extends JpaRepository<Ph,Integer>, JpaSpecificationExecutor<Ph> {

    /**
     * @author iusugar
     * @date 2019/9/15 16:46
     * @description 首页轮播数据
     * @return java.util.List
     */
    @Query(value = "SELECT gps.longitude,gps.latitude,gps.`timestamp`,boat.id,ph.ph_value\n" +
            "FROM boat,gps,user,ph\n" +
            "WHERE boat.user_id = `user`.id AND gps.id = ph.gps_id AND boat.id = ph.boat_id AND gps.boat_id = boat.id",nativeQuery = true)
    List getHomePageWaterQualityData();
}



//@Query(value =
//        "SELECT @row_num \\:= @row_num+1 as row_num,gps.longitude,gps.latitude,gps.`timestamp`,boat.id,ph.ph_value\n" +
//                "FROM boat,gps,user,ph\n" +
//                "WHERE boat.user_id = `user`.id AND gps.id = ph.gps_id AND boat.id = ph.boat_id AND gps.boat_id = boat.id;",nativeQuery = true)
