package com.greenfoxacademy.day03.controllers;

import com.greenfoxacademy.day03.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Utility {

  private  UtilityService utilityService;

    public Utility(UtilityService utilityService) {
        this.utilityService = utilityService;
    }
        @RequestMapping("/useful")
        public String useful(Model model){
            model.addAttribute("color", utilityService.randomColor());

            return "useful";
        }
        @RequestMapping("/useful/colors")
    public String colors(Model model){
        model.addAttribute("colors", utilityService.randomColor());
    return "useful/colors";
    }


    }






