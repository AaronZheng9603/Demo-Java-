package com.aaron.demo.design_patterns.singleton;

public class Lazy {

    private static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null) {
            instance =  new Lazy();
        }
        return instance;
    }

    private Lazy() {
    }

    public void print() {
        System.out.println("Lazy");
    }
}
