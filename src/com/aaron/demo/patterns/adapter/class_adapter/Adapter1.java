package com.aaron.demo.patterns.adapter.class_adapter;

public class Adapter1 extends Adaptee1 implements Targetable1 {

    @Override
    public void method2() {
        System.out.println("This is Targetable1's method2.");
    }
}
