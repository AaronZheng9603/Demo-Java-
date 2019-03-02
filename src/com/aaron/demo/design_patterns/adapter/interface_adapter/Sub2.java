package com.aaron.demo.design_patterns.adapter.interface_adapter;

public class Sub2 extends Targetable3Impl {

    @Override
    public void method2() {
        super.method2();
        System.out.println("Sub2 override method2.");
    }
}
