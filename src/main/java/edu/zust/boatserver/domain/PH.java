package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by HASEE on 2019/9/7
 */
@Data
@Entity
@Table(name = "ph")
public class PH implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "boat_id", foreignKey = @ForeignKey(name = "ph_ibfk_1"), nullable = false)
    private Boat boat;

    @ManyToOne
    @JoinColumn(name = "gps_id", foreignKey = @ForeignKey(name = "ph_ibfk_2"), nullable = false)
    private GPS gps;

    @Column(name = "ph_value")
    private Double phValue;
}
