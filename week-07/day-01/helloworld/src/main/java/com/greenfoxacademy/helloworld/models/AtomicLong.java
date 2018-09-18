package com.greenfoxacademy.helloworld.models;

import java.util.ArrayList;
import java.util.List;

public class AtomicLong {
    public static List<Greeting> greetingList = new ArrayList<>();

    public static int lastId() {
        return greetingList.size();
    }
}
