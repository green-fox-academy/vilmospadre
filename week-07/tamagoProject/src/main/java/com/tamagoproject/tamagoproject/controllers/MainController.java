package com.tamagoproject.tamagoproject.controllers;

import com.tamagoproject.tamagoproject.Services.FoxService;
import com.tamagoproject.tamagoproject.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    public static final FoxService foxService = new FoxService();

    @GetMapping("/")
    public String index(@RequestParam("name") String name, Model model) {
        if (foxService.getFox(name) == null) {
            foxService.addFox(name);
        }

        Fox fox = foxService.getFox(name);
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("trickCount", fox.getTricks().size());
        model.addAttribute("tricks", fox.getTricks());
        return "index";
    }
}