package com.cts.lrh.incident.dao;

import com.cts.lrh.incident.model.District;
import com.cts.lrh.incident.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sudarshana on 2/10/2016.
 */
@Repository
public interface DistrictRepository extends CrudRepository<District,Long>
{
}
