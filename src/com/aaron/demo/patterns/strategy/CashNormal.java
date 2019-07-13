package com.aaron.demo.patterns.strategy;

public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return 0;
    }
}
