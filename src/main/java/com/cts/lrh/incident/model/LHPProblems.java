package com.cts.lrh.incident.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sudarshana on 2/14/2016.
 */
@Entity
@Table
public class LHPProblems implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column
    private long lhpid;

    @Column
    private String date;

    @Column
    private String problem;

    @Column
    private String dayOfIllness;

    @Column
    private String actionTaken;

    @Column
    private String dayOfResolving;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDayOfIllness() {
        return dayOfIllness;
    }

    public void setDayOfIllness(String dayOfIllness) {
        this.dayOfIllness = dayOfIllness;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getDayOfResolving() {
        return dayOfResolving;
    }

    public void setDayOfResolving(String dayOfResolving) {
        this.dayOfResolving = dayOfResolving;
    }
}
