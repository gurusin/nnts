package com.cts.lrh.incident.model.admin;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by sudarshana on 2/21/2016.
 */
@Entity
@Table
public class MedProfessionalType implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int primaryKey;

    @Column
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medProfessionalType_key")
    @JsonIgnore
    private Set<MedProfCategory> medProfCategories;


    public Set<MedProfCategory> getMedProfCategories() {
        return medProfCategories;
    }

    public void setMedProfCategories(Set<MedProfCategory> medProfCategories) {
        this.medProfCategories = medProfCategories;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
