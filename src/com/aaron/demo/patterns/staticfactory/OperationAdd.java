package com.aaron.demo.patterns.staticfactory;

public class OperationAdd extends Operation {

    @Override
    public float getResult() {
        return getNum1() + getNum2();
    }
}
