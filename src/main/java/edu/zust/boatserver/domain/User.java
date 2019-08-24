package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by HASEE on 2019/8/20
 */
@Data
@Entity
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
}
