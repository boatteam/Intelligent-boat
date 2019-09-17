package edu.zust.boatserver.dto;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/15 22:51
 */
@Data
public class BoatInfo {
    private Integer id;
    private UserInfo userInfo;
    private String boatCode;
    private Double workHours;
    private Integer batteryRemain;
    private String location;
    private Double totalDistance;
}
