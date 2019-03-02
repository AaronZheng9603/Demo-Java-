package com.aaron.demo.design_patterns.observer;

public class Test {

    public static void main(String[] args) {
        Subject sender1 = new Sender();
        Observer observer = new MyObserver(sender1, "狗蛋");
        new MyObserver(sender1, "狗剩");
        new MyObserver(sender1, "全蛋");
        new MyObserver(sender1, "如花");
        System.out.println("-------------------");

        System.out.println("\n第二天...");
        sender1.notifyObservers();
        System.out.println("-------------------");

        System.out.println("\n一个月后...");
        sender1.removeObserver(observer);
        System.out.println("\n接下来...");
        sender1.notifyObservers();
    }
}
