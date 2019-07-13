package com.aaron.demo.patterns.singleton;

public enum EnumSingleton {

    INSTANCE;

    EnumSingleton() {

    }

    public void println() {
        System.out.println("Println");
    }
}
