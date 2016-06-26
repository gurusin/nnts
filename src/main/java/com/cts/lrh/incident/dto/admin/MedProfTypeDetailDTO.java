package com.cts.lrh.incident.dto.admin;

import com.cts.lrh.incident.model.admin.MedProfCategory;
import com.cts.lrh.incident.model.admin.MedProfessionalType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudarshana on 2/22/2016.
 */
public class MedProfTypeDetailDTO
{
    private int primaryKey;
    private String description;
    private List<MedProfCategoryLiteDTO> categories;


    public static MedProfTypeDetailDTO build(final MedProfessionalType type)
    {
        final MedProfTypeDetailDTO dto = new MedProfTypeDetailDTO();
        dto.primaryKey = type.getPrimaryKey();
        dto.description = type.getDescription();
        dto.categories = new ArrayList<MedProfCategoryLiteDTO>();
        for (final MedProfCategory obj : type.getMedProfCategories())
        {
            dto.categories.add(MedProfCategoryLiteDTO.build(obj));
        }
        return dto;
    }

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

    public List<MedProfCategoryLiteDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<MedProfCategoryLiteDTO> categories) {
        this.categories = categories;
    }
}
