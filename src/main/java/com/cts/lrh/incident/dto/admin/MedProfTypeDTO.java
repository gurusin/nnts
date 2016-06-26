package com.cts.lrh.incident.dto.admin;

import com.cts.lrh.incident.model.admin.MedProfessionalType;

/**
 * Created by sudarshana on 2/21/2016.
 */
public class MedProfTypeDTO
{
    private int primaryKey;
    private String description;

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  static MedProfTypeDTO build(final MedProfessionalType entity)
    {
        final MedProfTypeDTO dto = new MedProfTypeDTO();
        dto.primaryKey = entity.getPrimaryKey();
        dto.description = entity.getDescription();
        return dto;
    }
}
