package com.tamagoproject.tamagoproject.controllers;

import com.tamagoproject.tamagoproject.Services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NutritionController {
    private final FoxService foxService;

    public NutritionController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/nutrition")
    public String nutritionGet(String name, Model model) {
        model.addAttribute("name", name);
        return "nutrition";
    }

    @PostMapping("/nutrition")
    public String nutritionPost(String name, String food, String drink) {
        foxService.getFox(name).setFood(food);
        foxService.getFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }
}
