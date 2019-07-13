package com.aaron.demo.patterns.staticfactory;

public class OperationFactory {

    public static final int OPERATION_ADD = 0;
    public static final int OPERATION_SUB = 1;
    public static final int OPERATION_MUL = 2;
    public static final int OPERATION_DIV = 3;

    public static Operation createOperation(int type) {
        Operation operation = null;
        switch (type) {
            case OPERATION_ADD:
                operation = new OperationAdd();
                break;
            case OPERATION_SUB:
                operation = new OperationSub();
                break;
            case OPERATION_MUL:
                operation = new OperationMul();
                break;
            case OPERATION_DIV:
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
