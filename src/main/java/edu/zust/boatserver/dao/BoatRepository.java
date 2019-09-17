package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.Boat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HASEE on 2019/9/15 22:59
 */
public interface BoatRepository extends JpaRepository<Boat, Integer> {
    int countByBoatCode(String boatCode);
}
