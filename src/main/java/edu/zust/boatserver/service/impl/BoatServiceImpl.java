package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.BoatRepository;
import edu.zust.boatserver.dao.UserRepository;
import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.domain.User;
import edu.zust.boatserver.dto.BoatInfo;
import edu.zust.boatserver.dto.NewBoat;
import edu.zust.boatserver.dto.UserInfo;
import edu.zust.boatserver.service.BoatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HASEE on 2019/9/15 22:56
 */
@Service
@Transactional
@Slf4j
public class BoatServiceImpl implements BoatService {
    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isExisted(NewBoat newBoat) {
        return boatRepository.countByBoatCode(newBoat.getBoatCode())==1;
    }

    @Override
    public BoatInfo addBoat(NewBoat newBoat) {
        Boat boat = new Boat();
        if (newBoat!=null){
            User user = userRepository.getOne(newBoat.getUserId());
            boat.setBoatCode(newBoat.getBoatCode());
            boat.setUser(user);
            boatRepository.save(boat);
        }
        BoatInfo boatInfo = new BoatInfo();
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(boat, boatInfo);
        BeanUtils.copyProperties(boat.getUser(), userInfo);
        boatInfo.setUserInfo(userInfo);
        return boatInfo;
    }
}
