package com.aaron.demo.nothing;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Student();
        p1.setName("Aaron");
        p1.setGender("Male");
        p1.setAge(22);
        p1.introduce();
        ((Student) p1).study();
        System.out.println("---------------------------------\n");

        Person p2 = new Singer("Swift", "Female", 33);
        p2.introduce();
        ((Singer) p2).sing();
        System.out.println("---------------------------------\n");

        Person p3 = new Teacher("James", "Male", 43);
        p3.introduce();
        ((Teacher) p3).teach();
    }
}
