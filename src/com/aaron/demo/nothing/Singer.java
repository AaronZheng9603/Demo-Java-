package com.aaron.demo.nothing;

public class Singer extends Person {

    public Singer() {
        super();
    }

    public Singer(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void introduce() {
        System.out.println("I am singer.");
    }

    public void sing() {
        System.out.println("I am singing.");
    }
}
