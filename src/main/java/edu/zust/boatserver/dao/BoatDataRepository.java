package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.dto.WaterQualityDataDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/13 15:03
 * @description：小船数据访问操作接口
 */
@Repository
public interface BoatDataRepository extends JpaRepository<Boat,Integer>, JpaSpecificationExecutor<Boat> {

}
