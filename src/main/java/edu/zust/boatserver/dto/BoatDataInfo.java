package edu.zust.boatserver.dto;

import java.util.List;

/**
 * Created by HASEE on 2019/8/29
 */
public class BoatDataInfo {

    private String name;
    private List<Point> points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
