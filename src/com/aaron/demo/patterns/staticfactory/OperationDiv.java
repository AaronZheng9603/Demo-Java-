package com.aaron.demo.patterns.staticfactory;

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
