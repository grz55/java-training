package com.grz55.javatraining.algorithms;

public class SwappingVariablesWithoutTempAlgorithm {

    public static void main(String[] args) {

        //Integer overflow may occur

        int a = 10;
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " = a, " + b + " = b");

        //No risk of Integer overflow

        int x = 20;
        int y = 25;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x + " = x, " + y + " = y");
    }

}
