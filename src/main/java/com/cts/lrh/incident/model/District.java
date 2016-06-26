package com.cts.lrh.incident.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by sudarshana on 2/16/2016.
 */
@Entity
@Table
public class District implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column(length=15)
    private String name;

    @ManyToOne
    @JoinColumn(name = "province_key")
    private Province province;


    // Non persistent
    private transient long provinceId;

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

}
