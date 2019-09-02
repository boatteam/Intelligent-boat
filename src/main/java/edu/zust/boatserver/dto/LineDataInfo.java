package edu.zust.boatserver.dto;

/**
 * Created by HASEE on 2019/8/29
 */
public class LineDataInfo {
    private String name;
    private String boat_id;
    private String dataTime;
    private String pH;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoat_id() {
        return boat_id;
    }

    public void setBoat_id(String boat_id) {
        this.boat_id = boat_id;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getpH() {
        return pH;
    }

    public void setpH(String pH) {
        this.pH = pH;
    }
}
