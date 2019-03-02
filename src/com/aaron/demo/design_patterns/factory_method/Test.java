package com.aaron.demo.design_patterns.factory_method;

public class Test {

    public static void main(String[] args) {
        PhoneFactory apple = new AppleFactory();
        Phone iPhone = apple.createPhone();
        iPhone.show();

        PhoneFactory samsung = new SamsungFactory();
        Phone s10 = samsung.createPhone();
        s10.show();
    }
}
