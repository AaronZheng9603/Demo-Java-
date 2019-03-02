package com.aaron.demo.design_patterns.factory_method;

public class Apple implements Phone {

    @Override
    public void show() {
        System.out.println("Apple-iPhone was created.");
    }
}
