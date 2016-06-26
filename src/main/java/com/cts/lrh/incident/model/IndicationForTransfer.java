package com.cts.lrh.incident.model;


import javax.persistence.*;

/**
 * Created by sudarshana on 2/10/2016.
 */
@Entity
@Table
public class IndicationForTransfer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int primaryKey;

    @Column(length = 100)
    private String description;

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
