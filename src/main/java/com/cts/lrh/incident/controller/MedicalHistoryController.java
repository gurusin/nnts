package com.cts.lrh.incident.controller;

import com.cts.lrh.incident.dao.LocalHospitalPresentationRepository;
import com.cts.lrh.incident.dao.PreDepartureRepository;
import com.cts.lrh.incident.dao.admin.MedProfCategoryRepository;
import com.cts.lrh.incident.dao.admin.MedProfessionalRepository;
import com.cts.lrh.incident.dao.admin.MedProfessionalTypeRepository;
import com.cts.lrh.incident.dto.DepartureDTO;
import com.cts.lrh.incident.dto.admin.MedProfCategoryDTO;
import com.cts.lrh.incident.dto.admin.MedProfDTO;
import com.cts.lrh.incident.dto.admin.MedProfTypeDTO;
import com.cts.lrh.incident.dto.admin.MedProfTypeDetailDTO;
import com.cts.lrh.incident.model.LocalHospitalPresentation;
import com.cts.lrh.incident.model.PreDeparture;
import com.cts.lrh.incident.model.admin.MedProfCategory;
import com.cts.lrh.incident.model.admin.MedProfessional;
import com.cts.lrh.incident.model.admin.MedProfessionalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudarshana on 2/14/2016.
 */
@Controller
public class MedicalHistoryController
{
    @Autowired
    private LocalHospitalPresentationRepository localHospitalPresentationRepository;

    @Autowired
    private MedProfCategoryRepository medProfCategoryRepository;

    @Autowired
    private MedProfessionalTypeRepository medProfessionaTypeRepository;

    @Autowired
    private PreDepartureRepository preDepartureRepository;

    @Autowired
    private MedProfessionalRepository medProfessionalRepository;



    @RequestMapping(value="/medicalHistory",method = RequestMethod.GET)
    public ModelAndView init()
    {
        return new ModelAndView("/incident/MedicalHistory");
    }

    @RequestMapping(value="/preDeparture",method = RequestMethod.GET)
    public ModelAndView preDeparture()
    {
        final ModelAndView mdv = new ModelAndView("/incident/PreDeparture");
        mdv.addObject("medProfTypes",getAllTypes());
        return mdv;
    }

    @RequestMapping(value="savePreDeparture",method = RequestMethod.POST)
    public @ResponseBody void savePreDeparture(@RequestBody final DepartureDTO preDeparture)
    {
        final PreDeparture entity = preDeparture.getDeparture();
        entity.setReceivingUnitTeam(convert(preDeparture.getReceivingUnitProfessionals()));
        entity.setReferringUnitTeam(convert(preDeparture.getReferringUnitProfessionals()));
        preDepartureRepository.save(entity);
    }

    private List<MedProfessional> convert(final List<MedProfDTO> dto)
    {
        final List<MedProfessional> profs = new ArrayList<MedProfessional>();
        for (MedProfDTO obj:dto)
        {
            MedProfessional prf = new MedProfessional();
            prf.setName(obj.getName());
            prf.setMedProfCategory(medProfCategoryRepository.findOne(obj.getCategoryKey()));
            medProfessionalRepository.save(prf);
            profs.add(prf);
        }
        return profs;
    }


    @RequestMapping(value="/addPresentation",method = RequestMethod.POST)
    public @ResponseBody void createIncident(@RequestBody LocalHospitalPresentation presentation)
    {
        localHospitalPresentationRepository.save(presentation);
    }

    private List<MedProfTypeDetailDTO> getAllTypes()
    {
        final List<MedProfTypeDetailDTO> dtoList = new ArrayList<MedProfTypeDetailDTO>();
        for (final MedProfessionalType obj : medProfessionaTypeRepository.findAll())
        {
            dtoList.add(MedProfTypeDetailDTO.build(obj));
        }
        return dtoList;
    }

}
