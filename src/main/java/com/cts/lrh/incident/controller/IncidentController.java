package com.cts.lrh.incident.controller;

import com.cts.lrh.incident.dao.CenterRepository;
import com.cts.lrh.incident.dao.IncidentRepository;
import com.cts.lrh.incident.dao.IndicationForTransferRepository;
import com.cts.lrh.incident.dao.SuggestedPlanRepository;
import com.cts.lrh.incident.dto.IncidentDTO;
import com.cts.lrh.incident.dto.IncidentWrapper;
import com.cts.lrh.incident.model.Incident;
import com.cts.lrh.incident.model.SuggestedPlan;
import com.cts.lrh.incident.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudarshana on 2/13/2016.
 */
@Controller
public class IncidentController {
    final static SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

    @Autowired
    private SuggestedPlanRepository suggestedPlanRepository;

    @Autowired
    private IndicationForTransferRepository indicationForTransferRepository;

    @Autowired
    private IncidentRepository incidentRepository;

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "incident", method = RequestMethod.GET)
    public @ResponseBody ModelAndView init(@RequestParam("key") long key) {
        final ModelAndView modelAndView = new ModelAndView("/incident/incident");
        modelAndView.addObject("plans", suggestedPlanRepository.findAll());
        modelAndView.addObject("indications", indicationForTransferRepository.findAll());
        return modelAndView;
    }

    @RequestMapping("incidentData")
    public @ResponseBody IncidentWrapper incidentData(@RequestParam("key") long key)
    {
        IncidentDTO incident = null;
        if (key >0)
        {
            incident = IncidentDTO.build(incidentRepository.findOne(key));
        }else
        {
            incident = new IncidentDTO();
        }
        final IncidentWrapper wrapper= new IncidentWrapper();
        wrapper.setCenters(provinceService.getAllCenters());
        wrapper.setIncidentDTO(incident);
        wrapper.setSuggestedPlanList(suggestedPlanRepository.findAll());
        wrapper.setIndicationForTransfers(indicationForTransferRepository.findAll());
        return wrapper;
    }

    @RequestMapping(value = "/incidentList", method = RequestMethod.GET)
    public ModelAndView incidentList() {
        final ModelAndView modelAndView = new ModelAndView("/incident/IncidentList");
        modelAndView.addObject("incidents", getAllIncidents());
        return modelAndView;
    }

    @RequestMapping(value = "/addIncident", method = RequestMethod.POST)
    public @ResponseBody void createIncident(@RequestBody IncidentDTO incidentDTO) {
        final Incident incident = incidentDTO.getEntity();
        incident.setDateValues(format);
        incident.setReceivingCenter(centerRepository.findOne(incidentDTO.getReceivingCenter().getPrimaryKey()));
        incident.setReferingCenter(centerRepository.findOne(incidentDTO.getReferringCenter().getPrimaryKey()));
        incidentRepository.save(incident);
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("(yyyy-mm-dd hh:mm:ss");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    private List<IncidentDTO> getAllIncidents() {
        final List<IncidentDTO> dtoList = new ArrayList<IncidentDTO>();
        for (final Incident inc : incidentRepository.findAll()) {
            dtoList.add(IncidentDTO.build(inc));
        }
        return dtoList;
    }
}
