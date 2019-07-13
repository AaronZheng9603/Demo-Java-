package com.aaron.demo.patterns.builder;

public class Person {

    private final String name;
    private final String gender;
    private int age;
    private float height;
    private float weight;

    private Person(Builder builder) {
        name = builder.name;
        gender = builder.gender;
        age = builder.age;
        height = builder.height;
        weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String gender;
        private int age;
        private float height;
        private float weight;

        public Builder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(float height) {
            this.height = height;
            return this;
        }

        public Builder weight(float weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
