package com.aaron.demo.design_patterns.template;

public abstract class Phone {

    private void boot() {
        System.out.println("Boot");
    }

    private void powerOff() {
        System.out.println("Power off");
    }

    public final void behavior() {
        boot();
        use();
        powerOff();
    }

    public abstract void use();
}
