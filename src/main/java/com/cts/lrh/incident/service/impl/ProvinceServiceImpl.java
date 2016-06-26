package com.cts.lrh.incident.service.impl;

import com.cts.lrh.incident.dao.CenterRepository;
import com.cts.lrh.incident.dao.DistrictRepository;
import com.cts.lrh.incident.dao.ProvinceRepository;
import com.cts.lrh.incident.dto.CenterDTO;
import com.cts.lrh.incident.dto.DistrictDTO;
import com.cts.lrh.incident.dto.DistrictProvinceMapper;
import com.cts.lrh.incident.dto.ProvinceDTO;
import com.cts.lrh.incident.model.Center;
import com.cts.lrh.incident.model.District;
import com.cts.lrh.incident.model.Province;
import com.cts.lrh.incident.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sudarshana on 2/17/2016.
 */
@Component
@Transactional
public class ProvinceServiceImpl implements ProvinceService
{
    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private DistrictProvinceMapper mapper;

    @Override
    public List<ProvinceDTO> getAllProvinces()
    {
        return mapper.mapProvince(provinceRepository.findAll());
    }

    @Override
    public List<DistrictDTO> getAllDistricts()
    {
        return mapper.map(districtRepository.findAll());
    }

    @Override
    public List<CenterDTO> getAllCenters()
    {
        return mapper.mapCenter(centerRepository.findAll());
    }

    @Override
    public void saveCenter(final CenterDTO centerDTO)
    {
        final Center center = mapper.convertCenter(centerDTO);
        center.setDistrict(districtRepository.findOne(centerDTO.getDistrictKey()));
        centerRepository.save(center);
    }

    @Override
    public void saveDistrict(final DistrictDTO districtDTO)
    {
        final District district = mapper.convertDistrict(districtDTO);
        final Province province = provinceRepository.findOne(districtDTO.getProvinceKey());
        district.setProvince(province);
        districtRepository.save(district);

    }

}
