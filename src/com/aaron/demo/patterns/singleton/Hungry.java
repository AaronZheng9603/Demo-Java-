package com.aaron.demo.patterns.singleton;

public class Hungry {

    private static final Hungry ourInstance = new Hungry();

    public static Hungry getInstance() {
        return ourInstance;
    }

    private Hungry() {
    }

    public void print() {
        System.out.println("Hungry");
    }
}
