package edu.zust.boatserver;

import edu.zust.boatserver.dao.BoatDataRepository;
import edu.zust.boatserver.dao.UserRepository;
import edu.zust.boatserver.dao.WaterQualityDataRepository;
import edu.zust.boatserver.domain.Boat;
import edu.zust.boatserver.domain.User;
import edu.zust.boatserver.dto.WaterQualityDataDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBoatService {
    @Autowired
    BoatDataRepository boatDataRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    WaterQualityDataRepository waterQualityDataRepository;

    @Test
    public void getAll(){
        List list = boatDataRepository.findAll();
        System.err.println(list.get(0));
        System.err.println("ok1");
    }

    @Test
    public void saveOne(){
        Boat boat = new Boat();
        User user = new User();
        user.setId(9);
        user.setName("王老五");
        boat.setUser(user);
        boatDataRepository.save(boat);
        System.err.println("ok2");
    }

    @Test
    public void getHomePageData() throws ParseException {
//        List list = boatDataRepository.getHomePageData();
        List list = waterQualityDataRepository.getHomePageWaterQualityData();
        System.err.println(list.size());
//        for (Object row : list){
//            Object[] rowArray = (Object[]) row;
//            System.err.println(rowArray[0] + ".");
//        }
        List<WaterQualityDataDto> waterQualityList = new LinkedList<>();
        Iterator iterator = list.iterator();
        int count = 1;
        while (iterator.hasNext()){
            Object[] objects = (Object[]) iterator.next();
            WaterQualityDataDto waterQualityDataDto = new WaterQualityDataDto();
            waterQualityDataDto.setId(count++);
            waterQualityDataDto.setLongitude((Double) objects[0]);
            waterQualityDataDto.setLatitude((Double) objects[1]);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1 = (Timestamp)objects[2];
            String formatDate = dateFormat.format(date1);
            System.err.println(formatDate);

            waterQualityDataDto.setDate(formatDate);
            waterQualityDataDto.setBoatId((Integer) objects[3]);
            waterQualityDataDto.setPhValue((Double) objects[4]);
            System.err.println(waterQualityDataDto);
//            System.err.println(objects[2].getClass().toString());
            waterQualityList.add(waterQualityDataDto);
        }
        System.err.println(waterQualityList.size());
        System.err.println("ok3");
    }
}
