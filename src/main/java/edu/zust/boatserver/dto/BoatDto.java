package edu.zust.boatserver.dto;

import edu.zust.boatserver.domain.User;
import lombok.Data;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/14 9:19
 * @description：Boat实体数据传输对象
 */
@Data
public class BoatDto {
    private Integer id;

    private User user;

    private double workHours;

    private Integer batteryRemain;

    private String location;

    private double totalDistance;
}
