package com.cts.lrh.incident.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by sudarshana on 2/16/2016.
 */
@Table
@Entity
public class Province implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column(length=20)
    private String name;

    @OneToMany(mappedBy="province")
    private Set<District> districts;

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

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }
}
