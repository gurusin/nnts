package com.cts.lrh.incident.model.admin;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sudarshana on 2/21/2016.
 */
@Table
@Entity
public class MedProfCategory implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int primaryKey;

    @Column
    private String name;

    @Column(insertable = false, updatable = false)
    private int medProfessionalType_key;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medProfessionalType_key", nullable = false)
    private MedProfessionalType medProfessionalType;

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public MedProfessionalType getMedProfessionalType() {
        return medProfessionalType;
    }

    public void setMedProfessionalType(MedProfessionalType medProfessionalType) {
        this.medProfessionalType = medProfessionalType;
    }




    public int getMedProfessionalType_key() {
        return medProfessionalType_key;
    }

    public void setMedProfessionalType_key(int medProfessionalType_key) {
        this.medProfessionalType_key = medProfessionalType_key;
    }
}
