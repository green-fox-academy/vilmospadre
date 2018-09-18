package com.simbank.simbank.controller;

import com.simbank.simbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class multiAccountController {
    List<BankAccount> list = new ArrayList<>();
    @RequestMapping("/multiAccount")

    public String multiAccountShow(Model model){
        list.add(new BankAccount("Pityu", 200, "cat", "Zebra", false));
        list.add(new BankAccount("Jeno", 250, "bat", "Zebra", false));
        list.add(new BankAccount("Pepe", 1200, "cow", "Zebra", true));
        list.add(new BankAccount("Kapa", 500, "dog", "Zebra", false));
        model.addAttribute("list", list);

        return "multiAccount";
    }
}
