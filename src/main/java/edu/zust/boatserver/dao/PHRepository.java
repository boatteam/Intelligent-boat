package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.domain.PH;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by HASEE on 2019/9/16 23:32
 */
public interface PHRepository extends JpaRepository<PH, Integer> {
    List<PH> findAllByBoat(Boat boat);
}
