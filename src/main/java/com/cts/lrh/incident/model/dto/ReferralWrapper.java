package com.cts.lrh.incident.model.dto;

import com.cts.lrh.incident.dto.CenterDTO;

import java.util.List;

/**
 * Created by sudarshana on 5/30/2016.
 * Wraps the referal data to the front end
 */
public class ReferralWrapper
{
    private List<CenterDTO> centers;

    public List<CenterDTO> getCenters() {
        return centers;
    }

    public void setCenters(List<CenterDTO> centers) {
        this.centers = centers;
    }
}
