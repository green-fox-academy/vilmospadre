package com.greenfoxacademy.day03.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ColorGreen implements MyColor{
@Override
    public String printColor() {
    return "This color is green.";
}
}
