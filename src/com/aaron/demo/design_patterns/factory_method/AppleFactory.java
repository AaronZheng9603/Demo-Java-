package com.aaron.demo.design_patterns.factory_method;

public class AppleFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Apple();
    }
}
