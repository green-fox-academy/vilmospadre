package com.greenfoxacademy.helloworld.models;

import static com.greenfoxacademy.helloworld.models.AtomicLong.lastId;

public class Greeting {
    private long id;
    private String content;

    public Greeting(String content) {
        this.id = lastId() +1;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
