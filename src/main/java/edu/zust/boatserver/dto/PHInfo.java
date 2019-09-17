package edu.zust.boatserver.dto;

import lombok.Data;

/**
 * Created by HASEE on 2019/9/16 22:31
 */
@Data
public class PHInfo {
    private Integer id;
    private Integer boatId;
    private Integer gpsId;
    private Double phValue;
}
