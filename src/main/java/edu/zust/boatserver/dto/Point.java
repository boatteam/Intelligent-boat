package edu.zust.boatserver.dto;

import java.util.List;

/**
 * Created by HASEE on 2019/8/29
 */
public class Point {
    private String boat_id;
    private List<List<Float>> coords;

    public String getBoat_id() {
        return boat_id;
    }

    public void setBoat_id(String boat_id) {
        this.boat_id = boat_id;
    }

    public List<List<Float>> getCoords() {
        return coords;
    }

    public void setCoords(List<List<Float>> coords) {
        this.coords = coords;
    }
}
