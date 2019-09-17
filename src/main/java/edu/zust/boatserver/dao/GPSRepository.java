package edu.zust.boatserver.dao;

import edu.zust.boatserver.domain.GPS;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HASEE on 2019/9/16 23:16
 */
public interface GPSRepository extends JpaRepository<GPS, Integer> {
}
