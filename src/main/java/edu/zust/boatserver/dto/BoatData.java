package edu.zust.boatserver.dto;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/17 20:18
 */
@Data
public class BoatData {
    private Double pH;
    private Double longitude;
    private Double latitude;
    private String timeStamp;
    private Integer boatId;
    private String waterQuality;
}
