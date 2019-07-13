package com.aaron.demo.comm;

public class Test {

    public static void main(String[] args) {
        AbstractPerson person = new Student("James", 18, 183, 73);
        person.eat();
        person.talk();
        person.walk();

        IFly fly = (IFly) person;
        fly.fly();

        ICreate create = (ICreate) person;
        create.create();
    }
}
