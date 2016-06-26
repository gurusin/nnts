package com.cts.lrh.incident.dto;

import com.cts.lrh.incident.model.IndicationForTransfer;
import com.cts.lrh.incident.model.SuggestedPlan;
import com.fasterxml.jackson.databind.util.ArrayIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudarshana on 3/20/2016.
 */
public class IncidentWrapper
{
    private List<CenterDTO> centers;
    private IncidentDTO incidentDTO;
    private List<SuggestedPlan> suggestedPlanList;
    private Iterable<IndicationForTransfer> indicationForTransfers;

    public List<CenterDTO> getCenters() {
        return centers;
    }

    public void setCenters(List<CenterDTO> centers) {
        this.centers = centers;
    }

    public IncidentDTO getIncidentDTO() {
        return incidentDTO;
    }

    public void setIncidentDTO(IncidentDTO incidentDTO) {
        this.incidentDTO = incidentDTO;
    }

    public List<SuggestedPlan> getSuggestedPlanList() {
        return suggestedPlanList;
    }

    public void setSuggestedPlanList(Iterable<SuggestedPlan> suggestedPlanList) {
        this.suggestedPlanList = new ArrayList<SuggestedPlan>();
        for (SuggestedPlan obj :suggestedPlanList)
        {
            this.suggestedPlanList.add(obj);
        }
    }

    public Iterable<IndicationForTransfer> getIndicationForTransfers() {
        return indicationForTransfers;
    }

    public void setIndicationForTransfers(Iterable<IndicationForTransfer> indicationForTransfers) {
        this.indicationForTransfers = indicationForTransfers;
    }
}
