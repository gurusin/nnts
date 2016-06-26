package com.cts.lrh.incident.model;

import com.cts.lrh.incident.model.util.YesNoValue;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * This is the model class for referral
 * @author Sudarshana Gurusinghe
 * @since 18 May 2016
 */

@Entity
@Table
public class Referral implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column
    private long referenceNumber;

    @Column
    private Timestamp refDate;

    @Column
    private YesNoValue connectedViaEBS;

    @Column
    private String epsOperator;

    @Column
    private YesNoValue conferenceCall;

    @Column
    private ReferralType referralType;

    @ManyToOne
    @JoinColumn(name = "centerKey")
    private Center referringCentre;

    @Column
    private String contactName;

    @Column
    private String contactPhoneNumber;

    @Column
    private String ward;

    @Column
    private String consultantName;

    @Column
    private String exOrBleep;

    @Column
    private Timestamp dateOfTransfer;

    @Column
    private String transportTeam;

    @Column
    private String teamLocationAtCall;

    @ManyToOne
    @JoinColumn(name = "babyKey")
    private BabyDetails babyDetails;

    @Column
    private float currentWeight;

    public Timestamp getDateOfTransfer() {
        return dateOfTransfer;
    }

    public void setDateOfTransfer(Timestamp dateOfTransfer) {
        this.dateOfTransfer = dateOfTransfer;
    }

    public String getTransportTeam() {
        return transportTeam;
    }

    public void setTransportTeam(String transportTeam) {
        this.transportTeam = transportTeam;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public BabyDetails getBabyDetails() {
        return babyDetails;
    }

    public void setBabyDetails(BabyDetails babyDetails) {
        this.babyDetails = babyDetails;
    }

    public String getTeamLocationAtCall() {
        return teamLocationAtCall;
    }

    public void setTeamLocationAtCall(String teamLocationAtCall) {
        this.teamLocationAtCall = teamLocationAtCall;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public long getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Timestamp getRefDate() {
        return refDate;
    }

    public void setRefDate(Timestamp refDate) {
        this.refDate = refDate;
    }

    public YesNoValue getConnectedViaEBS() {
        return connectedViaEBS;
    }

    public void setConnectedViaEBS(YesNoValue connectedViaEBS) {
        this.connectedViaEBS = connectedViaEBS;
    }

    public String getEpsOperator() {
        return epsOperator;
    }

    public void setEpsOperator(String epsOperator) {
        this.epsOperator = epsOperator;
    }

    public YesNoValue getConferenceCall() {
        return conferenceCall;
    }

    public void setConferenceCall(YesNoValue conferenceCall) {
        this.conferenceCall = conferenceCall;
    }

    public ReferralType getReferralType() {
        return referralType;
    }

    public void setReferralType(ReferralType referralType) {
        this.referralType = referralType;
    }

    public Center getReferringCentre() {
        return referringCentre;
    }

    public void setReferringCentre(Center referringCentre) {
        this.referringCentre = referringCentre;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getExOrBleep() {
        return exOrBleep;
    }

    public void setExOrBleep(String exOrBleep) {
        this.exOrBleep = exOrBleep;
    }

    public static enum ReferralType
    {
        EMERGENCY("Emergency"),ELECTIVE("Elective Referral"),ENQUIRY("Enquiry");

        private String text;

        ReferralType(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
