package com.cts.lrh.incident.service;

import com.cts.lrh.incident.dto.CenterDTO;
import com.cts.lrh.incident.dto.DistrictDTO;
import com.cts.lrh.incident.dto.ProvinceDTO;

import java.util.List;

/**
 * Created by sudarshana on 2/17/2016.
 */
public interface ProvinceService {
    List<ProvinceDTO> getAllProvinces();

    List<DistrictDTO> getAllDistricts();

    List<CenterDTO> getAllCenters();

    void saveCenter(CenterDTO centerDTO);

    void saveDistrict(DistrictDTO districtDTO);
}
