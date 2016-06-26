package com.cts.lrh.incident.dto;

import com.cts.lrh.incident.model.Center;

/**
 * Created by sudarshana on 2/17/2016.
 */
public class CenterDTO
{
    private long primaryKey;
    private String name;
    private DistrictDTO districtDTO;
    private long districtKey;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DistrictDTO getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(DistrictDTO districtDTO) {
        this.districtDTO = districtDTO;
    }

    public long getDistrictKey() {
        return districtKey;
    }

    public void setDistrictKey(long districtKey) {
        this.districtKey = districtKey;
    }

    public static CenterDTO build(Center receivingCenter)
    {
        final CenterDTO dto = new CenterDTO();
        dto.primaryKey = receivingCenter.getPrimaryKey();
        dto.name = receivingCenter.getName();
        dto.districtDTO = DistrictDTO.build(receivingCenter.getDistrict());
        return dto;
    }
}
