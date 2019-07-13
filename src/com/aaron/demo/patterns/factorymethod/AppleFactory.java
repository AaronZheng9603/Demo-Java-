package com.aaron.demo.patterns.factorymethod;

public class AppleFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Apple();
    }
}
