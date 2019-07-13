package com.aaron.demo.patterns.decoration;

public class RingPhoneDecorator extends PhoneDecorator {

    private Phone phone;

    public RingPhoneDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        ring();
        super.call();
    }

    private void ring() {
        System.out.println("RingPhoneDecorator---ring()");
    }
}
