package com.cts.lrh.incident.model;

import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sudarshana on 2/14/2016.
 */
@Entity
@Table
public class LocalHospitalPresentation
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int primaryKey;

    @Column
    private boolean mother;

    @Column
    private boolean father;

    @Column
    private boolean guardian;

    @Column
    private boolean other;

    @Column
    private String radiological;

    @Column
    private String microbiological;

    @Column
    private String hematological;

    @Column
    private String examinationFindings;

    @Column
    private int findingType;

    @Column
    private int hematologicalType;

    @Column
    private int microbiologicalType;

    @Column
    private int radiologicalInvestigationType;


    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="lhpid")
    @IndexColumn(name="idx")
    private List<LHPMedication> medicationList;

    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="lhpid")
    @IndexColumn(name="idx")
    private List<LHPProblems> problemsList;


    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isMother() {
        return mother;
    }

    public void setMother(boolean mother) {
        this.mother = mother;
    }

    public boolean isFather() {
        return father;
    }

    public void setFather(boolean father) {
        this.father = father;
    }

    public boolean isGuardian() {
        return guardian;
    }

    public void setGuardian(boolean guardian) {
        this.guardian = guardian;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public String getRadiological() {
        return radiological;
    }

    public void setRadiological(String radiological) {
        this.radiological = radiological;
    }

    public String getMicrobiological() {
        return microbiological;
    }

    public void setMicrobiological(String microbiological) {
        this.microbiological = microbiological;
    }

    public String getHematological() {
        return hematological;
    }

    public void setHematological(String hematological) {
        this.hematological = hematological;
    }

    public List<LHPMedication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<LHPMedication> medicationList) {
        this.medicationList = medicationList;
    }

    public List<LHPProblems> getProblemsList() {
        return problemsList;
    }

    public void setProblemsList(List<LHPProblems> problemsList) {
        this.problemsList = problemsList;
    }

    public String getExaminationFindings() {
        return examinationFindings;
    }

    public void setExaminationFindings(String examinationFindings) {
        this.examinationFindings = examinationFindings;
    }

    public int getFindingType() {
        return findingType;
    }

    public void setFindingType(int findingType) {
        this.findingType = findingType;
    }

    public int getHematologicalType() {
        return hematologicalType;
    }

    public void setHematologicalType(int hematologicalType) {
        this.hematologicalType = hematologicalType;
    }

    public int getMicrobiologicalType() {
        return microbiologicalType;
    }

    public void setMicrobiologicalType(int microbiologicalType) {
        this.microbiologicalType = microbiologicalType;
    }
}
