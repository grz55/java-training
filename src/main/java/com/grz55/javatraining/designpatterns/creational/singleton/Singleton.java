package com.grz55.javatraining.designpatterns.creational.singleton;

public class Singleton {

    // Practical use: Database connector

    private static Singleton instance = null;
    private int value;

    private Singleton() {
        value = 100;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
