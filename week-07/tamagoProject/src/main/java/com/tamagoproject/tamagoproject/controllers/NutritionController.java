package com.tamagoproject.tamagoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NutritionController {

    @GetMapping("/nutrition")
    public String nutritionGet(String name, Model model) {
        model.addAttribute("name", name);
        return "nutrition";
    }

    @PostMapping("/nutrition")
    public String nutritionPost(String name, String food, String drink) {
        MainController.foxService.getFox(name).setFood(food);
        MainController.foxService.getFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }
}
