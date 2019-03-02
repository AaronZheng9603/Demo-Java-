package com.aaron.demo.nothing;

public class Student extends Person {

    public Student() {
        super();
    }

    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void introduce() {
        System.out.println("I am Student.");
    }

    public void study() {
        System.out.println("I am studying.");
    }
}
