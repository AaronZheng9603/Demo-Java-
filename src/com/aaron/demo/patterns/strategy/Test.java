package com.aaron.demo.patterns.strategy;

public class Test {

    public static void main(String[] args) {
        CashContext normalContext = new CashContext(CashContext.Type.NORMAL);
        CashContext returnContext = new CashContext(CashContext.Type.RETURN);
        CashContext rebateContext = new CashContext(CashContext.Type.REBATE);

        double money = 450;
        System.out.println(normalContext.getResult(money));
        System.out.println(returnContext.getResult(money));
        System.out.println(rebateContext.getResult(money));
    }
}
