package com.cts.lrh.incident.model;

import com.cts.lrh.incident.model.admin.MedProfessional;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by sudarshana on 2/14/2016.
 */
@Entity
@Table
public class PreDeparture implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column
    private Timestamp dateOfDeparture;

    @Column(length =100)
    private String medicalOfficer;

    @Column(length =100)
    private String nursingOfficer;

    @Column
    private CheckValue airwayMaintained;

    @Column
    private CheckValue guidelAirway;

    @Column
    private CheckValue ettSize;

    @Column
    private int ettSizeValue;

    @Column
    private CheckValue anchored;

    @Column
    private CheckValue ettPosition;

    @Column
    private CheckValue stomachEmptied;

    @Column
    private CheckValue pneumothorax;

    @Column
    private CheckValue ictInserted;

    @Column
    private CheckValue inAir;

    @Column
    private CheckValue tightFaceMask;

    @Column
    private CheckValue looseFaceMask;

    @Column
    private CheckValue nasalProngs;

    @Column
    private CheckValue headFox;

    @Column
    private CheckValue ippvFaceMask;

    @Column
    private CheckValue ippvETT;

    @Column
    private CheckValue ippvVentilator;

    @Column(length=6)
    private String oxygenRate;

    @Column
    private CheckValue chestExpansion;

    @Column
    private CheckValue airEntryEqual;

    @Column
    private CheckValue rrMinuteFlag;

    @Column(length=6)
    private String rrMinute;

    @Column
    private CheckValue abgSatisfactory;

    @Column(length=6)
    private String phValue;

    @Column(length=6)
    private String pao2;

    @Column(length=6)
    private String paco2;

    @Column(length=6)
    private String hco3;

    @Column(length=6)
    private String spo2;

    @Column
    private int lipLevel;

    @Column
    private CheckValue spo2Flag;

    @Column(length=5)
    private String ivLineCount;

    @Column
    private CheckValue ivLineSecured;

    @Column
    private CheckValue ivLineFlushing;

    @Column(length = 6)
    private String fluidBoluses;

    @Column(length = 10)
    private CheckValue inotropic;

    @Column(length = 5)
    private String pulseRate;

    @Column(length = 5)
    private String pulseVolume;

    @Column(length = 5)
    private String crft;

    @Column(length = 5)
    private String extremities;

    @Column(length = 6)
    private String bmStix;

    @Column(length = 10)
    private String skinColor;

    @Column
    private CheckValue fits;

    @Column(length = 10)
    private String fitsValue;

    @Column(length = 20)
    private String breathingPattern;

    @Column(length = 10)
    private String posture;

    @Column(length = 4)
    private String axTmp;

    @Column
    private CheckValue reWarming;

    @Column
    private CheckValue bagsCups;

    @Column
    private CheckValue kangarooCare;

    @Column
    private CheckValue warmBlankets;

    @Column
    private CheckValue hotWaterBlankets;

    @ManyToMany
    @JoinTable(name = "referring_unit_team")
    private List<MedProfessional> referringUnitTeam;

    @ManyToMany
    @JoinTable(name = "receiving_unit_team")
    private List<MedProfessional> receivingUnitTeam;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Timestamp getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Timestamp dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getMedicalOfficer() {
        return medicalOfficer;
    }

    public void setMedicalOfficer(String medicalOfficer) {
        this.medicalOfficer = medicalOfficer;
    }

    public String getNursingOfficer() {
        return nursingOfficer;
    }

    public void setNursingOfficer(String nursingOfficer) {
        this.nursingOfficer = nursingOfficer;
    }

    public CheckValue getAirwayMaintained() {
        return airwayMaintained;
    }

    public void setAirwayMaintained(CheckValue airwayMaintained) {
        this.airwayMaintained = airwayMaintained;
    }

    public CheckValue getGuidelAirway() {
        return guidelAirway;
    }

    public void setGuidelAirway(CheckValue guidelAirway) {
        this.guidelAirway = guidelAirway;
    }

    public CheckValue getEttSize() {
        return ettSize;
    }

    public void setEttSize(CheckValue ettSize) {
        this.ettSize = ettSize;
    }

    public CheckValue getAnchored() {
        return anchored;
    }

    public void setAnchored(CheckValue anchored) {
        this.anchored = anchored;
    }

    public CheckValue getEttPosition() {
        return ettPosition;
    }

    public void setEttPosition(CheckValue ettPosition) {
        this.ettPosition = ettPosition;
    }

    public CheckValue getStomachEmptied() {
        return stomachEmptied;
    }

    public void setStomachEmptied(CheckValue stomachEmptied) {
        this.stomachEmptied = stomachEmptied;
    }

    public CheckValue getPneumothorax() {
        return pneumothorax;
    }

    public void setPneumothorax(CheckValue pneumothorax) {
        this.pneumothorax = pneumothorax;
    }

    public CheckValue getIctInserted() {
        return ictInserted;
    }

    public void setIctInserted(CheckValue ictInserted) {
        this.ictInserted = ictInserted;
    }

    public CheckValue getInAir() {
        return inAir;
    }

    public void setInAir(CheckValue inAir) {
        this.inAir = inAir;
    }

    public CheckValue getTightFaceMask() {
        return tightFaceMask;
    }

    public void setTightFaceMask(CheckValue tightFaceMask) {
        this.tightFaceMask = tightFaceMask;
    }

    public CheckValue getLooseFaceMask() {
        return looseFaceMask;
    }

    public void setLooseFaceMask(CheckValue looseFaceMask) {
        this.looseFaceMask = looseFaceMask;
    }

    public CheckValue getNasalProngs() {
        return nasalProngs;
    }

    public void setNasalProngs(CheckValue nasalProngs) {
        this.nasalProngs = nasalProngs;
    }

    public CheckValue getHeadFox() {
        return headFox;
    }

    public void setHeadFox(CheckValue headFox) {
        this.headFox = headFox;
    }

    public CheckValue getIppvFaceMask() {
        return ippvFaceMask;
    }

    public void setIppvFaceMask(CheckValue ippvFaceMask) {
        this.ippvFaceMask = ippvFaceMask;
    }

    public CheckValue getIppvETT() {
        return ippvETT;
    }

    public void setIppvETT(CheckValue ippvETT) {
        this.ippvETT = ippvETT;
    }

    public CheckValue getIppvVentilator() {
        return ippvVentilator;
    }

    public void setIppvVentilator(CheckValue ippvVentilator) {
        this.ippvVentilator = ippvVentilator;
    }

    public String getOxygenRate() {
        return oxygenRate;
    }

    public void setOxygenRate(String oxygenRate) {
        this.oxygenRate = oxygenRate;
    }

    public CheckValue getChestExpansion() {
        return chestExpansion;
    }

    public void setChestExpansion(CheckValue chestExpansion) {
        this.chestExpansion = chestExpansion;
    }

    public CheckValue getAirEntryEqual() {
        return airEntryEqual;
    }

    public void setAirEntryEqual(CheckValue airEntryEqual) {
        this.airEntryEqual = airEntryEqual;
    }

    public CheckValue getRrMinuteFlag() {
        return rrMinuteFlag;
    }

    public void setRrMinuteFlag(CheckValue rrMinuteFlag) {
        this.rrMinuteFlag = rrMinuteFlag;
    }

    public String getRrMinute() {
        return rrMinute;
    }

    public void setRrMinute(String rrMinute) {
        this.rrMinute = rrMinute;
    }

    public CheckValue getAbgSatisfactory() {
        return abgSatisfactory;
    }

    public void setAbgSatisfactory(CheckValue abgSatisfactory) {
        this.abgSatisfactory = abgSatisfactory;
    }

    public String getPhValue() {
        return phValue;
    }

    public void setPhValue(String phValue) {
        this.phValue = phValue;
    }

    public String getPao2() {
        return pao2;
    }

    public void setPao2(String pao2) {
        this.pao2 = pao2;
    }

    public String getPaco2() {
        return paco2;
    }

    public void setPaco2(String paco2) {
        this.paco2 = paco2;
    }

    public String getHco3() {
        return hco3;
    }

    public void setHco3(String hco3) {
        this.hco3 = hco3;
    }

    public String getSpo2() {
        return spo2;
    }

    public void setSpo2(String spo2) {
        this.spo2 = spo2;
    }

    public CheckValue getSpo2Flag() {
        return spo2Flag;
    }

    public void setSpo2Flag(CheckValue spo2Flag) {
        this.spo2Flag = spo2Flag;
    }

    public String getIvLineCount() {
        return ivLineCount;
    }

    public void setIvLineCount(String ivLineCount) {
        this.ivLineCount = ivLineCount;
    }

    public CheckValue getIvLineSecured() {
        return ivLineSecured;
    }

    public void setIvLineSecured(CheckValue ivLineSecured) {
        this.ivLineSecured = ivLineSecured;
    }

    public CheckValue getIvLineFlushing() {
        return ivLineFlushing;
    }

    public void setIvLineFlushing(CheckValue ivLineFlushing) {
        this.ivLineFlushing = ivLineFlushing;
    }

    public String getFluidBoluses() {
        return fluidBoluses;
    }

    public void setFluidBoluses(String fluidBoluses) {
        this.fluidBoluses = fluidBoluses;
    }

    public CheckValue getInotropic() {
        return inotropic;
    }

    public void setInotropic(CheckValue inotropic) {
        this.inotropic = inotropic;
    }

    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
    }

    public String getPulseVolume() {
        return pulseVolume;
    }

    public void setPulseVolume(String pulseVolume) {
        this.pulseVolume = pulseVolume;
    }

    public String getCrft() {
        return crft;
    }

    public void setCrft(String crft) {
        this.crft = crft;
    }

    public String getExtremities() {
        return extremities;
    }

    public void setExtremities(String extremities) {
        this.extremities = extremities;
    }

    public String getBmStix() {
        return bmStix;
    }

    public void setBmStix(String bmStix) {
        this.bmStix = bmStix;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public CheckValue getFits() {
        return fits;
    }

    public void setFits(CheckValue fits) {
        this.fits = fits;
    }

    public String getFitsValue() {
        return fitsValue;
    }

    public void setFitsValue(String fitsValue) {
        this.fitsValue = fitsValue;
    }

    public String getBreathingPattern() {
        return breathingPattern;
    }

    public void setBreathingPattern(String breathingPattern) {
        this.breathingPattern = breathingPattern;
    }

    public String getPosture() {
        return posture;
    }

    public void setPosture(String posture) {
        this.posture = posture;
    }

    public String getAxTmp() {
        return axTmp;
    }

    public void setAxTmp(String axTmp) {
        this.axTmp = axTmp;
    }

    public CheckValue getReWarming() {
        return reWarming;
    }

    public void setReWarming(CheckValue reWarming) {
        this.reWarming = reWarming;
    }

    public CheckValue getBagsCups() {
        return bagsCups;
    }

    public void setBagsCups(CheckValue bagsCups) {
        this.bagsCups = bagsCups;
    }

    public CheckValue getKangarooCare() {
        return kangarooCare;
    }

    public void setKangarooCare(CheckValue kangarooCare) {
        this.kangarooCare = kangarooCare;
    }

    public CheckValue getWarmBlankets() {
        return warmBlankets;
    }

    public void setWarmBlankets(CheckValue warmBlankets) {
        this.warmBlankets = warmBlankets;
    }

    public CheckValue getHotWaterBlankets() {
        return hotWaterBlankets;
    }

    public void setHotWaterBlankets(CheckValue hotWaterBlankets) {
        this.hotWaterBlankets = hotWaterBlankets;
    }

    public List<MedProfessional> getReferringUnitTeam() {
        return referringUnitTeam;
    }

    public void setReferringUnitTeam(List<MedProfessional> referringUnitTeam) {
        this.referringUnitTeam = referringUnitTeam;
    }

    public List<MedProfessional> getReceivingUnitTeam() {
        return receivingUnitTeam;
    }

    public void setReceivingUnitTeam(List<MedProfessional> receivingUnitTeam) {
        this.receivingUnitTeam = receivingUnitTeam;
    }

    public int getEttSizeValue() {
        return ettSizeValue;
    }

    public void setEttSizeValue(int ettSizeValue) {
        this.ettSizeValue = ettSizeValue;
    }

    public int getLipLevel() {
        return lipLevel;
    }

    public void setLipLevel(int lipLevel) {
        this.lipLevel = lipLevel;
    }

    public static enum CheckValue
    {
        Yes("Yes"),No("No");

        private String text;

        CheckValue(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
