package com.aaron.demo.patterns.staticfactory;

public class Test {

    public static void main(String[] args) {
        float add = add(5, 14);
        System.out.println("add: " + add);
        float sub = sub(14, 5);
        System.out.println("sub: " + sub);
        float mul = mul(3, 4);
        System.out.println("mul: " + mul);
        float div = div(1, 24);
        System.out.println("div: " + div);
    }

    public static float add(float num1, float num2) {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_ADD);
        operation.setNum1(num1);
        operation.setNum2(num2);
        return operation.getResult();
    }

    public static float sub(float num1, float num2) {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_SUB);
        operation.setNum1(num1);
        operation.setNum2(num2);
        return operation.getResult();
    }

    public static float mul(float num1, float num2) {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_MUL);
        operation.setNum1(num1);
        operation.setNum2(num2);
        return operation.getResult();
    }

    public static float div(float num1, float num2) {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_DIV);
        operation.setNum1(num1);
        operation.setNum2(num2);
        return operation.getResult();
    }
}
