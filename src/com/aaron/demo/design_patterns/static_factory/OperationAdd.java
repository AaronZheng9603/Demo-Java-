package com.aaron.demo.design_patterns.static_factory;

public class OperationAdd extends Operation {

    @Override
    public float getResult() {
        return getNum1() + getNum2();
    }
}
