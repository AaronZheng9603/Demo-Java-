package com.aaron.demo.design_patterns.decoration;

public class Xiaomi implements Phone {

    @Override
    public void call() {
        System.out.println("Xiaomi---call()");
    }
}
