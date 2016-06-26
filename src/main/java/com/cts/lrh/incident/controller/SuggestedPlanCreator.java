package com.cts.lrh.incident.controller;

import com.cts.lrh.incident.dao.IndicationForTransferRepository;
import com.cts.lrh.incident.dao.PreDepartureRepository;
import com.cts.lrh.incident.dao.SuggestedPlanRepository;
import com.cts.lrh.incident.model.IndicationForTransfer;
import com.cts.lrh.incident.model.PreDeparture;
import com.cts.lrh.incident.model.SuggestedPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sudarshana on 2/11/2016.
 */
@RestController
public class SuggestedPlanCreator {

    @Autowired
    private SuggestedPlanRepository suggestedPlanRepository;


    @Autowired
    private IndicationForTransferRepository indicationForTransferRepository;

    @RequestMapping(value="/addPlan",method = RequestMethod.POST)
    void addPlan(@RequestBody SuggestedPlan plan)
    {
        suggestedPlanRepository.save(plan);
    }

    @RequestMapping(value = "/addIndication",method = RequestMethod.POST)
    void addIndication(@RequestBody IndicationForTransfer indicationForTransfer)
    {
        indicationForTransferRepository.save(indicationForTransfer);
    }

}
