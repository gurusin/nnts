package com.cts.lrh.incident.dto.admin;

import com.cts.lrh.incident.model.admin.MedProfCategory;


/**
 * Created by sudarshana on 2/21/2016.
 */
public class MedProfCategoryDTO
{
    private int primaryKey;
    private String name;
    private String medProfType;
    private int medProfTypeKey;

    public int getPrimaryKey() {
        return primaryKey;
    }

    public String getName() {
        return name;
    }

    public String getMedProfType() {
        return medProfType;
    }

    public int getMedProfTypeKey() {
        return medProfTypeKey;
    }

    public static class Builder
    {
        public static MedProfCategoryDTO build(MedProfCategory entity)
        {
            MedProfCategoryDTO dto = new MedProfCategoryDTO();
            dto.primaryKey = entity.getPrimaryKey();
            dto.name = entity.getName();
            dto.medProfType = entity.getMedProfessionalType().getDescription();
            dto.medProfTypeKey = entity.getMedProfessionalType().getPrimaryKey();
            return dto;
        }
    }

}
