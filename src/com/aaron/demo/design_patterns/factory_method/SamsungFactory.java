package com.aaron.demo.design_patterns.factory_method;

public class SamsungFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
