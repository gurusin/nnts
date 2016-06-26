package com.cts.lrh.incident.model.admin;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sudarshana on 2/22/2016.
 */
@Entity
@Table
public class MedProfessional implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private MedProfCategory medProfCategory;


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

    public MedProfCategory getMedProfCategory() {
        return medProfCategory;
    }

    public void setMedProfCategory(MedProfCategory medProfCategory) {
        this.medProfCategory = medProfCategory;
    }
}
