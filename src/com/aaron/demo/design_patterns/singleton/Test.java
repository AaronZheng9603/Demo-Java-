package com.aaron.demo.design_patterns.singleton;

public class Test {

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.println();
        EnumSingleton.valueOf("INSTANCE").println();
    }
}
