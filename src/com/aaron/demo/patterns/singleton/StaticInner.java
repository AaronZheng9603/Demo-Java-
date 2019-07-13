package com.aaron.demo.patterns.singleton;

public class StaticInner {

    private static class Holder {
        private static final StaticInner INSTANCE = new StaticInner();
    }

    public static StaticInner getInstance() {
        return Holder.INSTANCE;
    }

    private StaticInner() {
        System.out.println("...");
    }

    public void print() {
        System.out.println("StaticInner");
    }
}
