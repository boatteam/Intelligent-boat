package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * @author ：iusugar
 * @date ：Created in 2019/9/14 10:11
 * @description： 小船轨迹数据实体类
 */
@Data
@Entity
@Table(name = "gps")
public class Gps {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "boat_id")
    private Boat boat;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;
}
