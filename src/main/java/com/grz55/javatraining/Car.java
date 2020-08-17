package com.grz55.javatraining;

public class Car extends Vehicle {

    public final String region = "Europe";
    private static int carsCreated;

    @Override
    public void drive() {
        System.out.println("Car is driving");

    }

    public Car() {
        carsCreated++;
    }

    public static void howManyCarsCreated(){
        System.out.println("We created " + carsCreated + " cars");
    }
}
