package com.cts.lrh.incident.dto;

import com.cts.lrh.incident.dto.admin.MedProfDTO;
import com.cts.lrh.incident.model.PreDeparture;

import java.util.List;

/**
 * Created by sudarshana on 2/22/2016.
 */
public class DepartureDTO
{
    private PreDeparture departure;
    private List<MedProfDTO> referringUnitProfessionals;
    private List<MedProfDTO> receivingUnitProfessionals;

    public PreDeparture getDeparture() {
        return departure;
    }

    public void setDeparture(PreDeparture departure) {
        this.departure = departure;
    }

    public List<MedProfDTO> getReferringUnitProfessionals() {
        return referringUnitProfessionals;
    }

    public void setReferringUnitProfessionals(List<MedProfDTO> referringUnitProfessionals) {
        this.referringUnitProfessionals = referringUnitProfessionals;
    }

    public List<MedProfDTO> getReceivingUnitProfessionals() {
        return receivingUnitProfessionals;
    }

    public void setReceivingUnitProfessionals(List<MedProfDTO> receivingUnitProfessionals) {
        this.receivingUnitProfessionals = receivingUnitProfessionals;
    }
}
