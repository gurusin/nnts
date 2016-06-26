package com.cts.lrh.incident.dto;

import java.util.List;

/**
 * Created by sudarshana on 2/17/2016.
 */
public class ProvinceDTO
{
    private long primaryKey;
    private String name;
    private List<DistrictDTO> districts;

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

    public List<DistrictDTO> getDistricts() {
        return districts;
    }

    public void setDistricts(List<DistrictDTO> districts) {
        this.districts = districts;
    }
}
