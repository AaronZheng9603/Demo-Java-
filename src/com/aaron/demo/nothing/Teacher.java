package com.aaron.demo.nothing;

public class Teacher extends Person {

    public Teacher() {
        super();
    }

    public Teacher(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void introduce() {
        System.out.println("I am teacher.");
    }

    public void teach() {
        System.out.println("I am teaching.");
    }
}
