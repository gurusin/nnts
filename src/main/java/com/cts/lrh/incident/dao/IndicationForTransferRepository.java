package com.cts.lrh.incident.dao;

import com.cts.lrh.incident.model.IndicationForTransfer;
import com.cts.lrh.incident.model.SuggestedPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sudarshana on 2/10/2016.
 */
@Repository
public interface IndicationForTransferRepository extends CrudRepository<IndicationForTransfer,Integer> {
}
