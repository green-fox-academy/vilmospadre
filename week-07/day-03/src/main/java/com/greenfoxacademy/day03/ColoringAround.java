package com.greenfoxacademy.day03;

import com.greenfoxacademy.day03.services.MyColor;
import com.greenfoxacademy.day03.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ColoringAround implements CommandLineRunner {

    Printer printer;
    MyColor myColor;

    public ColoringAround(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoringAround.class, args);
    }

   @Override
    public void run(String...args){
       System.out.println("");
       printer.log(myColor.printColor());

    }
}
