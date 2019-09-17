package edu.zust.boatserver.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by HASEE on 2019/9/16 23:02
 */
@Data
public class SocketInfo {
    private String name;
    private List<BoatData> boatDataList;
}
