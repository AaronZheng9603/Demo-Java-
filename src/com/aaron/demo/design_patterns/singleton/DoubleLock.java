package com.aaron.demo.design_patterns.singleton;

public class DoubleLock {

    private static DoubleLock instance;

    public static DoubleLock getInstance() {
        if (instance == null) {
            synchronized (DoubleLock.class) {
                if (instance == null) {
                    instance =  new DoubleLock();
                }
            }
        }
        return instance;
    }

    private DoubleLock() {
    }

    public void print() {
        System.out.println("DoubleLock");
    }
}
