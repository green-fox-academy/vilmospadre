package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Doubling;
import com.greenfoxacademy.demo.models.Result;
import com.greenfoxacademy.demo.models.Until;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    public int sum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return sum;
    }

    @GetMapping("/doubling")
    public Doubling renderIndex(@RequestParam("input") Integer input) {
        return new Doubling(input);
    }

    @PostMapping("/dountil/{action}")
    public Result renderDoUntil(@PathVariable("action") String action, @RequestBody Until untilObject) {
        if (action.equals("sum")) {
            return new Result(sum(untilObject));
        }
        return new Result(2);
    }

    @GetMapping("/appenda/{appended}")
    public Appenda appendaTask(@PathVariable("appended") String appended) {
        return new Appenda(appended);
    }

    public static class Appenda {
        public String appended;

        public Appenda(String appended) {
            this.appended = appended + "a";
        }

        public String getAppended() {
            return appended;
        }

        public void setAppended(String appended) {
            this.appended = appended;
        }
    }
}
