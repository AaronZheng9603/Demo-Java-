package com.aaron.demo.design_patterns.observer;

public class MyObserver implements Observer {

    private final String mName;

    public MyObserver(Subject sender, String name) {
        mName = name;
        sender.registerObserver(this);
    }

    @Override
    public void getMilk() {
        System.out.println("我是" + mName + "，马上来拿牛奶。");
    }

    @Override
    public String getName() {
        return mName;
    }
}
