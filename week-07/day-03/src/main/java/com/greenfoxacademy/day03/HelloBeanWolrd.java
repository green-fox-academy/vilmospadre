package com.greenfoxacademy.day03;

import com.greenfoxacademy.day03.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HelloBeanWolrd implements CommandLineRunner {

    Printer printer;

    public HelloBeanWolrd(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {

        SpringApplication.run(HelloBeanWolrd.class, args);
    }

    @Override
    public void run(String... strings) {
        printer.log("hello");
    }
}