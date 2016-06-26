package com.cts.lrh.incident.controller;

import com.cts.lrh.incident.dao.CenterRepository;
import com.cts.lrh.incident.dao.ReferralRepository;
import com.cts.lrh.incident.dto.IncidentDTO;
import com.cts.lrh.incident.dto.IncidentWrapper;
import com.cts.lrh.incident.model.Center;
import com.cts.lrh.incident.model.Referral;
import com.cts.lrh.incident.model.dto.ReferralFullDTO;
import com.cts.lrh.incident.model.dto.ReferralWrapper;
import com.cts.lrh.incident.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sudarshana on 4/28/2016.
 */
@Controller
public class ReferralController
{
    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private ReferralRepository referralRepository;

    @Autowired
    private CenterRepository centerRepository;

    @RequestMapping("referral")
    public String init() {
        return "referral/referral";
    }

    @RequestMapping(value = "saveReferral",method = RequestMethod.POST)
    public String saveReferral(@RequestBody ReferralFullDTO referral)
    {
        final Referral entity = referral.getReferral();
        entity.setReferringCentre(centerRepository.findOne(referral.getSelectedCentreKey()));
        referralRepository.save(entity);
        return "menu";
    }

    @RequestMapping("referralData")
    public @ResponseBody ReferralWrapper referralData(@RequestParam("key") long key)
    {
        ReferralWrapper referralWrapper = null;
        if (key >0)
        {
           // ReferralWrapper = IncidentDTO.build(incidentRepository.findOne(key));
        }else
        {
            referralWrapper = new ReferralWrapper();
        }

        referralWrapper.setCenters(provinceService.getAllCenters());
        return referralWrapper;
    }
}
