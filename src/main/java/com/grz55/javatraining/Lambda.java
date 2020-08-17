package com.grz55.javatraining;

import java.util.ArrayList;

public class Lambda {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.forEach((n) -> System.out.println(n));
        long count = numbers.stream().count();
        System.out.println("Number of elements: " + count);
    }
}
