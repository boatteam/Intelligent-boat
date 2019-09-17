package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by HASEE on 2019/9/7
 */
@Data
@Entity
@Table(name = "gps")
public class GPS implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "boat_id", foreignKey = @ForeignKey(name = "gps_ibfk_1"), nullable = false)
    private Boat boat;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;
}
