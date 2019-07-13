package com.aaron.demo.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Sender implements Subject {

    private List<Observer> mObservers;

    public Sender() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
        System.out.println("我是" + observer.getName() + "，我要订奶。");
    }

    @Override
    public void removeObserver(Observer observer) {
        mObservers.remove(observer);
        System.out.println("我是" + observer.getName() + "，我不想订奶了。");
    }

    @Override
    public void notifyObservers() {
        System.out.println("牛奶来了。");
        for (Observer observer : mObservers) {
            observer.getMilk();
        }
    }
}
