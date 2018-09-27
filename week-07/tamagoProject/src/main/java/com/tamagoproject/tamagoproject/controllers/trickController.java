package com.tamagoproject.tamagoproject.controllers;

import com.tamagoproject.tamagoproject.Services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class trickController {

    private final FoxService foxService;


    public trickController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/trick")
    public String trickGet(String name, Model model) {
        model.addAttribute("name", name);
        return "trick";

    }

    @PostMapping("/trick")
    public String trickPost(String name, String trick, Model model) {
        if (!foxService.getFox(name).getTricks().contains(trick)) {
            foxService.getFox(name).getTricks().add(trick);

        }
        return "redirect:/login" + name;
    }
}
