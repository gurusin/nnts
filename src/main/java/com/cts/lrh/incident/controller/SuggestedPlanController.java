package com.cts.lrh.incident.controller;

import com.cts.lrh.incident.dao.IndicationForTransferRepository;
import com.cts.lrh.incident.dao.SuggestedPlanRepository;
import com.cts.lrh.incident.model.IndicationForTransfer;
import com.cts.lrh.incident.model.SuggestedPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by sudarshana on 2/10/2016.
 */
@Controller
public class SuggestedPlanController
{
    @Autowired
    private SuggestedPlanRepository suggestedPlanRepository;

    @Autowired
    private IndicationForTransferRepository indicationForTransferRepository;

    @RequestMapping(method = RequestMethod.GET, value="/plan")
    public String init()
    {
        return "/plan/plan";
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAllPlans")
    public @ResponseBody Iterable<SuggestedPlan> getAll()
    {
        return suggestedPlanRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value="/getIndications")
    public @ResponseBody Iterable<IndicationForTransfer> getAllIndications()
    {
        return indicationForTransferRepository.findAll();
    }






}
