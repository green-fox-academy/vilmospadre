package com.greenfoxacademy.rest.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
    public class MainController {

        @GetMapping("/")
        public String main() {
            return "index";
        }

        @GetMapping("/doubling")
        @ResponseBody
        public Doubler doubling(@RequestParam(required = false) Integer input) {

            if (input == null) {
                return new Doubler();
            } else return new Doubler(input);
        }

        static class Doubler {
            public int received;
            public int result;
            public String error;

            public Doubler(int received) {
                this.received = received;
                this.result = received * 2;
            }

            public Doubler() {
                this.error = "Please provide an input!";
            }

        }

        @GetMapping("/greeter")
        @ResponseBody
        public Greeter greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
            Greeter greeter = new Greeter();

            if (name == null) {
                greeter.error = "Please provide a name!";
                return greeter;
            } else if (title == null) {
                greeter.error = "Please provide a title!";
                return greeter;
            } else return new Greeter(name, title);

        }

        static class Greeter {
            public String error;
            public String welcome_message;

            public Greeter(String name, String title) {
                this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
            }

            public Greeter() {
                this.welcome_message = "";
            }
        }

        @GetMapping("/appenda/{appendable}")
        @ResponseBody
        public AppendA append(@PathVariable String appendable) {
            return new AppendA(appendable);
        }

        static class AppendA {
            public String appended;

            public AppendA(String appendable) {
                this.appended = appendable + "a";
            }
        }

        @PostMapping("/dountil/{action}")
        @ResponseBody
        public DoUntil doUntil(@PathVariable String action, @RequestBody(required = false) Number number) {
            DoUntil doUntil = new DoUntil();
            if (number == null) {
                doUntil.error = "Please provide a number!";
            } else if (action.equals("sum")) {
                doUntil.result = doUntil.sum(number.until);
            } else if (action.equals("factor")) {
                doUntil.result = doUntil.factor(number.until);
            } else {
                doUntil.error = "Invalid action";}
            return doUntil;
        }

        static class DoUntil {
            public long result;
            public String error;


            public DoUntil() {
            }

            public long sum(int until) {
                int sum = 0;
                for (int i = 1; i < until + 1; i++) {
                    sum += i;
                }
                return sum;
            }

            public long factor(int until) {
                int sum = 1;
                for (int i = 1; i < until + 1; i++) {
                    sum *= i;
                }
                return sum;
            }

        }

        static class Number {
            public int until;

        }
    }

