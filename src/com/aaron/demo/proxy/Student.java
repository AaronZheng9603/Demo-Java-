package com.aaron.demo.proxy;

public class Student implements Person {

    @Override
    public void doSomething() {
        System.out.println("Student should study.");
    }
}
