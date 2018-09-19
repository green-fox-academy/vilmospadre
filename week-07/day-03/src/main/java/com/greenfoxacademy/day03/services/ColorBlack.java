package com.greenfoxacademy.day03.services;

import org.springframework.stereotype.Service;


public class ColorBlack implements MyColor {
    @Override
    public String printColor() {
        return "This is black color.";
    }
}
