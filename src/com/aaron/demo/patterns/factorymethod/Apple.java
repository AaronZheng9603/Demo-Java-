package com.aaron.demo.patterns.factorymethod;

public class Apple implements Phone {

    @Override
    public void show() {
        System.out.println("Apple-iPhone was created.");
    }
}
