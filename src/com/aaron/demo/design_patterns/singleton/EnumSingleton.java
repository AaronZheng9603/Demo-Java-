package com.aaron.demo.design_patterns.singleton;

public enum EnumSingleton {

    INSTANCE();

    EnumSingleton() {

    }

    public void println() {
        System.out.println("Println");
    }
}
