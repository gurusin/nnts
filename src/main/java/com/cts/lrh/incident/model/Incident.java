package com.cts.lrh.incident.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by sudarshana on 2/13/2016.
 */
@Entity
@Table
public class Incident implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @ManyToOne
    @JoinColumn(name = "receivingCenter_key")
    private Center receivingCenter;

    @ManyToOne
    @JoinColumn(name = "referringCenter_key")
    private Center referingCenter;

    @Column
    private String nameOfBaby;

    @Column
    private long age;

    @Column
    private String sex;

    @Column
    private String nameOfMother;

    @Column
    private String telephone;

    @Column
    private String bhtNumber;

    @Column
    private String babyBG;

    @Column
    private String motherBG;

    @Column
    private String concent;

    @Column
    private String concentType;

    public String getConcentType() {
        return concentType;
    }

    public void setConcentType(String concentType) {
        this.concentType = concentType;
    }

    @Column
    private long selectedPlan;

    @Column
    private String planDescription;

    @Column
    private long selectedIndication;

    @Column
    private String indicationDescription;

    @Column
    private String parity;

    @Column
    private String vantenatalComplications;

    @Column
    private String riskFactor;

    @Column
    private boolean nvd;

    @Column
    private boolean forceps;

    @Column
    private boolean vaccum;

    @Column
    private boolean lsps;

    @Column
    private boolean em;

    @Column
    private boolean elec;

    @Column
    private Timestamp dateofBirth;

    @Column
    private long birthWeight;

    @Column
    private String placeOfBirth;

    @Column
    private Timestamp edd;


    @Column
    private Timestamp ivFirst;

    @Column
    private Timestamp ivSecond;

    @Column
    private String intervention;

    //Non saving fields
    private String birthtime;
    private String ivFirstTime;
    private String ivSecondTime;
    private String eddTime;

    private long refKey;
    private long receivingKey;

    public long getRefKey() {
        return refKey;
    }

    public void setRefKey(long refKey) {
        this.refKey = refKey;
    }

    public long getReceivingKey() {
        return receivingKey;
    }


    public void setReceivingKey(long receivingKey) {
        this.receivingKey = receivingKey;
    }

    public String getEddTime() {
        return eddTime;
    }

    public void setEddTime(String eddTime) {
        this.eddTime = eddTime;
    }

    public void setBirthTime(final String birthTime)
    {
        this.birthtime = birthTime;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Center getReceivingCenter() {
        return receivingCenter;
    }

    public void setReceivingCenter(Center receivingCenter) {
        this.receivingCenter = receivingCenter;
    }

    public Center getReferingCenter() {
        return referingCenter;
    }

    public void setReferingCenter(Center referingCenter) {
        this.referingCenter = referingCenter;
    }

    public String getNameOfBaby() {
        return nameOfBaby;
    }

    public void setNameOfBaby(String nameOfBaby) {
        this.nameOfBaby = nameOfBaby;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNameOfMother() {
        return nameOfMother;
    }

    public void setNameOfMother(String nameOfMother) {
        this.nameOfMother = nameOfMother;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBhtNumber() {
        return bhtNumber;
    }

    public void setBhtNumber(String bhtNumber) {
        this.bhtNumber = bhtNumber;
    }

    public String getBabyBG() {
        return babyBG;
    }

    public void setBabyBG(String babyBG) {
        this.babyBG = babyBG;
    }

    public String getMotherBG() {
        return motherBG;
    }

    public void setMotherBG(String motherBG) {
        this.motherBG = motherBG;
    }

    public String getConcent() {
        return concent;
    }

    public void setConcent(String concent) {
        this.concent = concent;
    }

    public long getSelectedPlan() {
        return selectedPlan;
    }

    public void setSelectedPlan(long selectedPlan) {
        this.selectedPlan = selectedPlan;
    }

    public long getSelectedIndication() {
        return selectedIndication;
    }

    public void setSelectedIndication(long selectedIndication) {
        this.selectedIndication = selectedIndication;
    }

    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    public String getVantenatalComplications() {
        return vantenatalComplications;
    }

    public void setVantenatalComplications(String vantenatalComplications) {
        this.vantenatalComplications = vantenatalComplications;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public boolean isNvd() {
        return nvd;
    }

    public void setNvd(boolean nvd) {
        this.nvd = nvd;
    }

    public boolean isForceps() {
        return forceps;
    }

    public void setForceps(boolean forceps) {
        this.forceps = forceps;
    }

    public boolean isVaccum() {
        return vaccum;
    }

    public void setVaccum(boolean vaccum) {
        this.vaccum = vaccum;
    }

    public boolean isLsps() {
        return lsps;
    }

    public void setLsps(boolean lsps) {
        this.lsps = lsps;
    }

    public boolean isEm() {
        return em;
    }

    public void setEm(boolean em) {
        this.em = em;
    }

    public boolean isElec() {
        return elec;
    }

    public void setElec(boolean elec) {
        this.elec = elec;
    }

    public Timestamp getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Timestamp dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public long getBirthWeight() {
        return birthWeight;
    }

    public void setBirthWeight(long birthWeight) {
        this.birthWeight = birthWeight;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Timestamp getEdd() {
        return edd;
    }

    public void setEdd(Timestamp edd) {
        this.edd = edd;
    }

    public Timestamp getIvFirst() {
        return ivFirst;
    }

    public void setIvFirst(Timestamp ivFirst) {
        this.ivFirst = ivFirst;
    }

    public Timestamp getIvSecond() {
        return ivSecond;
    }

    public void setIvSecond(Timestamp ivSecond) {
        this.ivSecond = ivSecond;
    }

    public String getIntervention() {
        return intervention;
    }

    public void setIntervention(String intervention) {
        this.intervention = intervention;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public String getIndicationDescription() {
        return indicationDescription;
    }

    public void setIndicationDescription(String indicationDescription) {
        this.indicationDescription = indicationDescription;
    }

    public void setDateValues(final SimpleDateFormat format)
    {
        try {
            dateofBirth = convert(birthtime,format);
            ivFirst = convert(ivFirstTime,format);
            ivSecond = convert(ivSecondTime,format);
            edd = convert(eddTime,format);
        } catch (Exception e) {
            e.printStackTrace();
            //null value assigned if a wrong format is entered.
        }
    }

    private Timestamp convert(final String value, final SimpleDateFormat format)
    {
        if (value == null) return null;
        return Timestamp.valueOf(value);
    }

    public void setIvFirstTime(String ivFirstTime) {
        this.ivFirstTime = ivFirstTime;
    }

    public void setIvSecondTime(String ivSecondTime) {
        this.ivSecondTime = ivSecondTime;
    }
}
