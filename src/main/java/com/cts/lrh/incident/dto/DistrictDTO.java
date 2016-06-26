package com.cts.lrh.incident.dto;

import com.cts.lrh.incident.model.District;

/**
 * Created by sudarshana on 2/17/2016.
 */
public class DistrictDTO
{
    private long primaryKey;
    private String name;
    private ProvinceDTO provinceDTO;
    private long provinceKey;

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

    public ProvinceDTO getProvinceDTO() {
        return provinceDTO;
    }

    public void setProvinceDTO(ProvinceDTO provinceDTO) {
        this.provinceDTO = provinceDTO;
    }

    public long getProvinceKey() {
        return provinceKey;
    }

    public void setProvinceKey(long provinceKey) {
        this.provinceKey = provinceKey;
    }

    public static DistrictDTO build(District district)
    {
        final DistrictDTO dto = new DistrictDTO();
        dto.setPrimaryKey(district.getPrimaryKey());
        dto.name = district.getName();
        return dto;
    }
}
