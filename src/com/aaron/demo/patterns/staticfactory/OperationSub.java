package com.aaron.demo.patterns.staticfactory;

public class OperationSub extends Operation {

    @Override
    public float getResult() {
        return getNum1() - getNum2();
    }
}
