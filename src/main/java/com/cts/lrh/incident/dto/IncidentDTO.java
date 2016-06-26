package com.cts.lrh.incident.dto;

import com.cts.lrh.incident.model.Center;
import com.cts.lrh.incident.model.Incident;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * Created by sudarshana on 2/22/2016.
 */
public class IncidentDTO
{
    private long primaryKey;
    private String nameOfBaby;
    private long age;
    private String sex;
    private String nameOfMother;
    private String telephone;
    private String bhtNumber;
    private String babyBG;
    private String motherBG;
    private String concent;
    private String concentType;
    private long selectedPlan;
    private String planDescription;
    private long selectedIndication;
    private String indicationDescription;
    private String parity;
    private String vantenatalComplications;
    private String riskFactor;
    private boolean nvd;
    private boolean forceps;
    private boolean vaccum;
    private boolean lsps;
    private boolean em;
    private boolean elec;
    private Timestamp dateofBirth;
    private long birthWeight;
    private String placeOfBirth;
    private Timestamp edd;
    private String gestation;
    private Timestamp ivFirst;
    private Timestamp ivSecond;
    private String intervention;

    private CenterDTO receivingCenter;
    private CenterDTO referringCenter;

    public static  IncidentDTO build(final Incident incident)
    {
        final IncidentDTO dto = new IncidentDTO();
        dto.primaryKey = incident.getPrimaryKey();
        dto.nameOfBaby = incident.getNameOfBaby();
        dto.age = incident.getAge();
        dto.sex =incident.getSex();
        dto.nameOfMother = incident.getNameOfMother();
        dto.telephone = incident.getTelephone();
        dto.bhtNumber = incident.getBhtNumber();
        dto.babyBG = incident.getBabyBG();
        dto.motherBG =incident.getMotherBG();
        dto.concent = incident.getConcent();
        dto.concentType = incident.getConcentType();
        dto.selectedPlan = incident.getSelectedPlan();
        dto.planDescription = incident.getPlanDescription();
        dto.selectedIndication = incident.getSelectedIndication();
        dto.indicationDescription = incident.getIndicationDescription();
        dto.parity = incident.getParity();
        dto.vantenatalComplications = incident.getVantenatalComplications();
        dto.riskFactor = incident.getRiskFactor();
        dto.nvd = incident.isNvd();
        dto.forceps = incident.isForceps();
        dto.vaccum = incident.isVaccum();
        dto.lsps = incident.isLsps();
        dto.em = incident.isEm();
        dto.elec = incident.isElec();
        dto.dateofBirth = incident.getDateofBirth();
        dto.birthWeight = incident.getBirthWeight();
        dto.placeOfBirth = incident.getPlaceOfBirth();
        dto.edd = incident.getEdd();
        dto.ivFirst = incident.getIvFirst();
        dto.ivSecond = incident.getIvSecond();
        dto.intervention = incident.getIntervention();
        dto.receivingCenter = CenterDTO.build(incident.getReceivingCenter());
        dto.referringCenter = CenterDTO.build(incident.getReferingCenter());
        return dto;
    }

    public Incident getEntity()
    {
        final Incident entity = new Incident();
        entity.setPrimaryKey(primaryKey);
        entity.setNameOfBaby(nameOfBaby);
        entity.setAge(age);
        entity.setSex(sex);
        entity.setNameOfMother(nameOfMother);
        entity.setTelephone(telephone);
        entity.setBhtNumber(bhtNumber);
        entity.setBabyBG(babyBG);
        entity.setMotherBG(motherBG);
        entity.setConcent(concent);
        entity.setConcentType(concentType);
        entity.setSelectedPlan(selectedPlan);
        entity.setPlanDescription(planDescription);
        entity.setSelectedIndication(selectedIndication);
        entity.setIndicationDescription(indicationDescription);
        entity.setParity(parity);
        entity.setVantenatalComplications(vantenatalComplications);
        entity.setRiskFactor(riskFactor);
        entity.setNvd(nvd);
        entity.setForceps(forceps);
        entity.setVaccum(vaccum);
        entity.setLsps(lsps);
        entity.setEm(em);
        entity.setElec(elec);
        entity.setDateofBirth(dateofBirth);
        entity.setBirthWeight(birthWeight);
        entity.setPlaceOfBirth(placeOfBirth);
        entity.setEdd(edd);
        entity.setIvFirst(ivFirst);
        entity.setIvSecond(ivSecond);
        entity.setIntervention(intervention);
        return entity;
    }

    public boolean isVaccum() {
        return vaccum;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public String getNameOfBaby() {
        return nameOfBaby;
    }

    public long getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNameOfMother() {
        return nameOfMother;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getBhtNumber() {
        return bhtNumber;
    }

    public String getBabyBG() {
        return babyBG;
    }

    public String getMotherBG() {
        return motherBG;
    }

    public String getConcent() {
        return concent;
    }

    public String getConcentType() {
        return concentType;
    }

    public long getSelectedPlan() {
        return selectedPlan;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public long getSelectedIndication() {
        return selectedIndication;
    }

    public String getIndicationDescription() {
        return indicationDescription;
    }

    public String getParity() {
        return parity;
    }

    public String getVantenatalComplications() {
        return vantenatalComplications;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public boolean isNvd() {
        return nvd;
    }

    public boolean isForceps() {
        return forceps;
    }

    public boolean isLsps() {
        return lsps;
    }

    public boolean isEm() {
        return em;
    }

    public boolean isElec() {
        return elec;
    }

    public Timestamp getDateofBirth() {
        return dateofBirth;
    }

    public long getBirthWeight() {
        return birthWeight;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public Timestamp getEdd() {
        return edd;
    }

    public String getGestation() {
        return gestation;
    }

    public Timestamp getIvFirst() {
        return ivFirst;
    }

    public Timestamp getIvSecond() {
        return ivSecond;
    }

    public String getIntervention() {
        return intervention;
    }

    public CenterDTO getReceivingCenter() {
        return receivingCenter;
    }

    public CenterDTO getReferringCenter() {
        return referringCenter;
    }
}
