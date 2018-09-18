package com.simbank.simbank.controller;

import com.simbank.simbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BankAccuntController {
    @RequestMapping("/show")

    public String showAccount(Model model) {
        BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", "Zebra", true);
        model.addAttribute("simbaInfo", bankAccount);
        model.addAttribute("proba", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "show";
    }
}
