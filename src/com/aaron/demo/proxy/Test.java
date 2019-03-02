package com.aaron.demo.proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Person person = new Student();
        person.doSomething();
        System.out.println("---------------------------");

        Person proxy = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new MyInvocationHandler(person));
        proxy.doSomething();
    }
}
