package com.grz55.javatraining;

public interface Employee {

    int age = 12;

    default String print(){
        return "Im an interface";
    };

}
