package org.example.main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
