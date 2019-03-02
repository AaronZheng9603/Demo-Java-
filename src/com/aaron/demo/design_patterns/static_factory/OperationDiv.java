package com.aaron.demo.design_patterns.static_factory;

public class OperationDiv extends Operation {

    @Override
    public float getResult() {
        float result = 0F;
        try {
            result = getNum1() / getNum2();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}
