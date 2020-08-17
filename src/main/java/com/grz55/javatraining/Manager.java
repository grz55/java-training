package com.grz55.javatraining;

public class Manager implements Employee {

    public int age;

    @Override
    public String print() {
        return "Manager";
    }
}
