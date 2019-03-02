package com.aaron.demo.design_patterns.adapter.interface_adapter;

public class Sub1 extends Targetable3Impl {

    @Override
    public void method1() {
        super.method1();
        System.out.println("Sub1 override method1.");
    }
}
