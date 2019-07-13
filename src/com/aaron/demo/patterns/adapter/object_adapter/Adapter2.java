package com.aaron.demo.patterns.adapter.object_adapter;

public class Adapter2 implements Targetable2 {

    private Adaptee2 adaptee2;

    public Adapter2(Adaptee2 adaptee2) {
        this.adaptee2 = adaptee2;
    }

    @Override
    public void method1() {
        adaptee2.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is Targetable2's method2.");
    }
}
