package com.aaron.demo.patterns.strategy;

public class CashRebate implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money - money * 0.8;
    }
}
