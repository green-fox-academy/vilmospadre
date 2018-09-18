package com.greenfoxacademy.helloworld.controllers;

import com.greenfoxacademy.helloworld.models.AtomicLong;
import com.greenfoxacademy.helloworld.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRestController {

    @RequestMapping ("/liszka")
    public Greeting greeting(@RequestParam("name")String name) {
        Greeting greeting = new Greeting( "Hello " + name + " !");
        AtomicLong.greetingList.add(greeting);
        return greeting;
    }
}
