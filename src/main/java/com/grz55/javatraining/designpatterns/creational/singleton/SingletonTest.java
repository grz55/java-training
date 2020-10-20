package com.grz55.javatraining.designpatterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.getValue());
        System.out.println("Singleton hashcode: " + singleton.getInstance().hashCode());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setValue(10);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());

        System.out.println("Singleton2 hashcode " + singleton2.getInstance().hashCode());


    }
}
