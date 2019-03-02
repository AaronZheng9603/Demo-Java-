package com.aaron.demo.design_patterns.decoration;

public class GamePhoneDecorator extends PhoneDecorator {

    private Phone phone;

    public GamePhoneDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        game();
    }

    private void game() {
        System.out.println("GamePhoneDecorator---game()");
    }
}
