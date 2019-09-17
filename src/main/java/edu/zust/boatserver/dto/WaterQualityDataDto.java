package edu.zust.boatserver.dto;

import lombok.Data;



/**
 * @author ：iusugar
 * @date ：Created in 2019/9/14 17:03
 * @description：水质数据传输对象
 */
@Data
public class WaterQualityDataDto {

    private Integer id;

    private double longitude;

    private double latitude;

    private String date;

    private Integer boatId;

    private double phValue;

    private String waterQuality;

}
