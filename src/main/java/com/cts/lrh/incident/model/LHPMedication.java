package com.cts.lrh.incident.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sudarshana on 2/14/2016.
 */
@Entity
@Table
public class LHPMedication implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column
    private long lhpid;

    @Column
    private String drug;

    @Column
    private String dosage;

    @Column
    private String frequency;

    @Column
    private String duration;

    @Column
    private String timeOfLastDosage;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public long getLhpid() {
        return lhpid;
    }

    public void setLhpid(long lhpid) {
        this.lhpid = lhpid;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTimeOfLastDosage() {
        return timeOfLastDosage;
    }

    public void setTimeOfLastDosage(String timeOfLastDosage) {
        this.timeOfLastDosage = timeOfLastDosage;
    }
}
