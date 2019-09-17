package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/12 15:24
 * @description： 小船数据实体类
 */
@Data
@Entity
@Table(name = "boat")
public class Boat {
    @Id
    @GeneratedValue(generator = "increment")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "work_hours")
    private double workHours;

    @Column(name = "battery_remain")
    private Integer batteryRemain;

    @Column(name = "location")
    private String location;

    @Column(name = "total_distance")
    private double totalDistance;
}
