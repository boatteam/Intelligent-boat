package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by HASEE on 2019/9/6
 */
@Data
@Entity
@Table(name = "boat")
public class Boat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "boat_ibfk_1"), nullable = false)
    private User user;

    @Column(name = "boat_code")
    private String boatCode;

    @Column(name = "work_hours")
    private Double workHours;

    @Column(name = "battery_remain", length = 3)
    private Integer batteryRemain;

    @Column(name = "location")
    private String location;

    @Column(name = "total_distance")
    private Double totalDistance;
}
