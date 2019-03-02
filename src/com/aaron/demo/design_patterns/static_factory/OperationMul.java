package com.aaron.demo.design_patterns.static_factory;

public class OperationMul extends Operation {

    @Override
    public float getResult() {
        return getNum1() * getNum2();
    }
}
