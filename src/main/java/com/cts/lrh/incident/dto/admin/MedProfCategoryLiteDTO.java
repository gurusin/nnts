package com.cts.lrh.incident.dto.admin;

import com.cts.lrh.incident.model.admin.MedProfCategory;

/**
 * Created by sudarshana on 2/22/2016.
 */
public class MedProfCategoryLiteDTO
{
    private int primaryKey;
    private String name;

    public int getPrimaryKey() {
        return primaryKey;
    }

    public String getName() {
        return name;
    }

    public static MedProfCategoryLiteDTO build(final MedProfCategory category)
    {
        final MedProfCategoryLiteDTO dto = new MedProfCategoryLiteDTO();
        dto.primaryKey = category.getPrimaryKey();
        dto.name = category.getName();
        return dto;
    }
}
