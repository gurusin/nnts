package com.cts.lrh.incident.dto.admin;

import java.util.List;

/**
 * Created by sudarshana on 3/20/2016.
 */
public class MedProfWrapper {

    private List<MedProfTypeDTO> medProfTypeDTOs;
    private List<MedProfCategoryDTO> medProfCategoryDTOs;

    public List<MedProfTypeDTO> getMedProfTypeDTOs() {
        return medProfTypeDTOs;
    }

    public void setMedProfTypeDTOs(List<MedProfTypeDTO> medProfTypeDTOs) {
        this.medProfTypeDTOs = medProfTypeDTOs;
    }

    public List<MedProfCategoryDTO> getMedProfCategoryDTOs() {
        return medProfCategoryDTOs;
    }

    public void setMedProfCategoryDTOs(List<MedProfCategoryDTO> medProfCategoryDTOs) {
        this.medProfCategoryDTOs = medProfCategoryDTOs;
    }
}
