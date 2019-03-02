package com.aaron.demo.design_patterns.decoration;

public class Test {

    public static void main(String[] args) {
        Phone p1 = new Xiaomi();
        p1.call();
        System.out.println("--------------------------------");

        Phone p2 = new GamePhoneDecorator(new Xiaomi());
        p2.call();
        System.out.println("--------------------------------");

        Phone p3 = new RingPhoneDecorator(new GamePhoneDecorator(new Xiaomi()));
        p3.call();
        System.out.println("--------------------------------");

        Phone p4 = new GamePhoneDecorator(new RingPhoneDecorator(new Xiaomi()));
        p4.call();
        System.out.println("--------------------------------");
    }
}
