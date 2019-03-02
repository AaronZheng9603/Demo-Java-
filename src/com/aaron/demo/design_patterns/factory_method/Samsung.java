package com.aaron.demo.design_patterns.factory_method;

public class Samsung implements Phone {

    @Override
    public void show() {
        System.out.println("Samsung-Galaxy S10 was created.");
    }
}
