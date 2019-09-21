package edu.zust.boatserver.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by HASEE on 2019/9/16 22:27
 */
@Data
public class GPSInfo {
    private Integer id;
    private Integer boatId;
    private Date timestamp;
    private Double longitude;
    private Double latitude;
}
