package com.cts.lrh.incident.dto;

import com.cts.lrh.incident.model.Center;
import com.cts.lrh.incident.model.District;
import com.cts.lrh.incident.model.Province;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by sudarshana on 2/17/2016.
 */
@Component
public class DistrictProvinceMapper
{

    public District convertDistrict(final DistrictDTO dto)
    {
        final District district = new District();
        district.setPrimaryKey(dto.getPrimaryKey());
        district.setName(dto.getName());
        return district;
    }

    public Center convertCenter(final CenterDTO dto)
    {
        final Center center = new Center();
        center.setPrimaryKey(dto.getPrimaryKey());
        center.setName(dto.getName());
        return center;
    }

    public DistrictDTO map(final District district)
    {
        final DistrictDTO dto = new DistrictDTO();
        dto.setPrimaryKey(district.getPrimaryKey());
        dto.setName(district.getName());
        //dto.setProvinceDTO(map(district.getProvince()));
        return dto;
    }

    public List<DistrictDTO> map(final Iterable<District> district)
    {
        final List<DistrictDTO> list = new ArrayList<DistrictDTO>();
        for (final District dis : district)
        {
            list.add(map(dis));
        }
        return list;
    }


    public ProvinceDTO map(final Province province)
    {
        final ProvinceDTO provinceDTO = new ProvinceDTO();
        provinceDTO.setPrimaryKey(province.getPrimaryKey());
        provinceDTO.setName(province.getName());
        provinceDTO.setDistricts(map(province.getDistricts()));
        return provinceDTO;
    }

    public List<ProvinceDTO> mapProvince(final Iterable<Province> province)
    {
        final List<ProvinceDTO> list = new ArrayList<ProvinceDTO>();
        for (final Province dis : province)
        {
            list.add(map(dis));
        }
        return list;
    }

    public CenterDTO map(final Center center)
    {
        final CenterDTO centerDTO = new CenterDTO();
        centerDTO.setPrimaryKey(center.getPrimaryKey());
        centerDTO.setName(center.getName());
        centerDTO.setDistrictDTO(map(center.getDistrict()));
        return centerDTO;
    }

    public List<CenterDTO> mapCenter(final Iterable<Center> center)
    {
        final List<CenterDTO> list = new ArrayList<CenterDTO>();
        for (final Center dis : center)
        {
            list.add(map(dis));
        }
        return list;
    }
}
