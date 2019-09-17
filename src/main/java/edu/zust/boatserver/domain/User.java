package edu.zust.boatserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by HASEE on 2019/8/20
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "phone",length = 20, nullable = false)
    private String phone;

    @Column(name = "password",length = 20, nullable = false)
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthday")
    private Date birthday;

    @Temporal(TemporalType.DATE)
    @Column(name = "regist_date")
    private Date registDate;

    @Column(name = "province", length = 20)
    private String province;

    @Column(name = "city", length = 20)
    private String city;
}
