package com.aaron.demo.patterns.factorymethod;

public class Samsung implements Phone {

    @Override
    public void show() {
        System.out.println("Samsung-Galaxy S10 was created.");
    }
}
