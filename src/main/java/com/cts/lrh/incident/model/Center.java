package com.cts.lrh.incident.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sudarshana on 2/16/2016.
 */
@Entity
@Table
public class Center implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column(length=100)
    private String name;

    @ManyToOne
    @JoinColumn(name="districtKey")
    private District district;

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

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
