package com.aaron.demo.patterns.factorymethod;

public class SamsungFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
