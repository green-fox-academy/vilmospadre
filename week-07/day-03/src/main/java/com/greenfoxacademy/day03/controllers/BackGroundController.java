package com.greenfoxacademy.day03.controllers;

import com.greenfoxacademy.day03.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackGroundController {


    private UtilityService utilityService;

    public BackGroundController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/colors")
    public String BackGround(Model model) {
        model.addAttribute("colors", utilityService.randomColor());
        return "colors";

    }
}

