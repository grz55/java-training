package com.grz55.javatraining;

public class NotAdultException extends RuntimeException {
    public NotAdultException(int age) {
        super("You are too young. Only " + age + " years old!");
    }
}
