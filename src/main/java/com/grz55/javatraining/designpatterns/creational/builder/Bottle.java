package com.grz55.javatraining.designpatterns.creational.builder;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
