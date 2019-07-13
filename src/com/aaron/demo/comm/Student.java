package com.aaron.demo.comm;

public class Student extends AbstractPerson implements IFly, ICreate {

    public Student() {
    }

    public Student(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }

    @Override
    public void eat() {
        System.out.println("Student-eat()");
    }

    @Override
    public void talk() {
        System.out.println(toString());
    }

    @Override
    public void walk() {
        System.out.println("Student-walk()");
    }

    @Override
    public void create() {
        System.out.println("Student-create()");
    }

    @Override
    public void fly() {
        System.out.println("Student-fly()");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
