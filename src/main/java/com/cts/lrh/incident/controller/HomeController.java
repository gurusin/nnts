package com.cts.lrh.incident.controller;

import com.cts.lrh.incident.dao.CenterRepository;
import com.cts.lrh.incident.dao.DistrictRepository;
import com.cts.lrh.incident.dao.ProvinceRepository;
import com.cts.lrh.incident.dto.CenterDTO;
import com.cts.lrh.incident.dto.DistrictDTO;
import com.cts.lrh.incident.dto.ProvinceDTO;
import com.cts.lrh.incident.model.Center;
import com.cts.lrh.incident.model.District;
import com.cts.lrh.incident.model.Province;
import com.cts.lrh.incident.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CenterRepository centerRepository;

    @RequestMapping("home")
    public String home() {
        return "index";
    }

    @RequestMapping("menu")
    public String menu() {
        return "menu";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("/")
    public String start() {
        return "login";
    }

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    public String doLogin(String username, String password, HttpSession session) {
        if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
            session.setAttribute("Logged", true);
            session.setAttribute("loggedInUser","Administrator");
            return "index";
        }
        return "login";
    }

    @RequestMapping(value = "center")
    public String center(ModelMap model) {
        //model.put("provinces", provinceService.getAllProvinces());
        model.put("centers", provinceService.getAllCenters());
        return "/center/center";
    }
    @RequestMapping(value = "provinces")
    public @ResponseBody List<ProvinceDTO> getProvinces()
    {
        return provinceService.getAllProvinces();
    }

    @RequestMapping(value = "centers")
    public @ResponseBody List<CenterDTO> getCenters()
    {
        return provinceService.getAllCenters();
    }


    @RequestMapping(value = "/saveProvince", method = RequestMethod.POST)
    public @ResponseBody Iterable<Province> saveProvince(@RequestBody final Province province) {
        provinceRepository.save(province);
        return provinceRepository.findAll();
    }

    @RequestMapping(value = "/saveCenter", method = RequestMethod.POST)
    public  @ResponseBody List<CenterDTO> saveCenter(@RequestBody final CenterDTO center) {
        provinceService.saveCenter(center);
        return provinceService.getAllCenters();
    }

    @RequestMapping(value = "/saveDistrict", method = RequestMethod.POST)
    public  @ResponseBody List<ProvinceDTO> saveDistrict(@RequestBody final DistrictDTO district) {
        provinceService.saveDistrict(district);
        return provinceService.getAllProvinces();
    }
}
