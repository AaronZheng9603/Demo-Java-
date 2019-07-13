package com.aaron.demo.patterns.strategy;

public class CashReturn implements CashSuper {

    @Override
    public double acceptCash(double money) {
        if (money >= 300) {
            return money - 300;
        }
        return 0;
    }
}
