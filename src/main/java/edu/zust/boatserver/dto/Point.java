package edu.zust.boatserver.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by HASEE on 2019/8/29
 */
@Data
public class Point {
    private String boat_id;
    private List<List<Float>> coords;
}
