package com.aaron.demo.design_patterns.decoration;

public abstract class PhoneDecorator implements Phone {

    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }
}
