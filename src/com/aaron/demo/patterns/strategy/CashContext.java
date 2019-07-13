package com.aaron.demo.patterns.strategy;

public class CashContext {

    private CashSuper mCashSuper;

    public CashContext(Type type) {
        switch (type) {
            case NORMAL:
                mCashSuper = new CashNormal();
                break;
            case RETURN:
                mCashSuper = new CashReturn();
                break;
            case REBATE:
                mCashSuper = new CashRebate();
                break;
        }
    }

    public double getResult(double money) {
        return mCashSuper.acceptCash(money);
    }

    public enum Type {
        NORMAL, RETURN, REBATE
    }
}
