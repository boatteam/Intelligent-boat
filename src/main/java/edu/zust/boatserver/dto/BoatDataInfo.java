package edu.zust.boatserver.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by HASEE on 2019/8/29
 */
@Data
public class BoatDataInfo {
    private String name;
    private List<Point> points;
}
