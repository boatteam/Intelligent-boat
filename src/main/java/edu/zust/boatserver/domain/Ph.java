package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ：iusugar
 * @date ：Created in 2019/9/14 15:47
 * @description：PH值数据实体
 */
@Data
@Entity
@Table(name = "ph")
public class Ph {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "boat_id")
    private Boat boat;

    @OneToOne
    @JoinColumn(name = "gps_id")
    private Gps gps;

    @Column(name = "ph_value")
    private double phValue;
}
