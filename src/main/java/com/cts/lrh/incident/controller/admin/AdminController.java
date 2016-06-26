package com.cts.lrh.incident.controller.admin;

import com.cts.lrh.incident.dao.admin.MedProfCategoryRepository;
import com.cts.lrh.incident.dao.admin.MedProfessionalTypeRepository;
import com.cts.lrh.incident.dto.admin.MedProfCategoryDTO;
import com.cts.lrh.incident.dto.admin.MedProfTypeDTO;
import com.cts.lrh.incident.dto.admin.MedProfWrapper;
import com.cts.lrh.incident.model.admin.MedProfCategory;
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
 * Created by sudarshana on 2/21/2016.
 */
@Controller
public class AdminController
{
    @Autowired
    private MedProfessionalTypeRepository medProfessionaTypeRepository;

    @Autowired
    private MedProfCategoryRepository medProfCategoryRepository;

    @RequestMapping("medicalProfessionals")
    public ModelAndView medicalProfessionals()
    {
        final ModelAndView modelAndView = new ModelAndView("admin/StaffAdmin");
        return modelAndView;
    }

    @RequestMapping("medProfData")
    public @ResponseBody MedProfWrapper getMedProfData()
    {
        final MedProfWrapper wrapper = new MedProfWrapper();
        wrapper.setMedProfCategoryDTOs(getAllCategories());
        wrapper.setMedProfTypeDTOs(getAllTypes());
        return wrapper;
    }

    @RequestMapping(value = "saveMedProfType", method = RequestMethod.POST)
    public @ResponseBody Iterable saveMedicalProfessionalType(@RequestBody final MedProfessionalType medProfessionalType)
    {
        medProfessionaTypeRepository.save(medProfessionalType);
        return getAllTypes();
    }

    @RequestMapping(value = "saveCategory", method = RequestMethod.POST)
    public @ResponseBody Iterable saveMedicalProfessionalType(@RequestBody final MedProfCategory medProfCategory)
    {
        final MedProfessionalType type = medProfessionaTypeRepository.findOne(medProfCategory.getMedProfessionalType_key());
        medProfCategory.setMedProfessionalType(type);
        medProfCategoryRepository.save(medProfCategory);
        return getAllCategories();
    }

    private List<MedProfCategoryDTO> getAllCategories()
    {
        final List<MedProfCategoryDTO> dtoList = new ArrayList<MedProfCategoryDTO>();
        for (final MedProfCategory obj : medProfCategoryRepository.findAll())
        {
            dtoList.add(MedProfCategoryDTO.Builder.build(obj));
        }
        return dtoList;
    }

    private List<MedProfTypeDTO> getAllTypes()
    {
        final List<MedProfTypeDTO> dtoList = new ArrayList<MedProfTypeDTO>();
        for (final MedProfessionalType obj : medProfessionaTypeRepository.findAll())
        {
            dtoList.add(MedProfTypeDTO.build(obj));
        }
        return dtoList;
    }
}
