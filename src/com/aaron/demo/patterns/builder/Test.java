package com.aaron.demo.patterns.builder;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person.Builder("Aaron", "Male")
                .age(22)
                .height(178F)
                .weight(120F)
                .build();
        Person p2 = new Person.Builder("Nicole", "Female")
                .build();
        System.out.println(p1);
        System.out.println(p2);
    }
}
