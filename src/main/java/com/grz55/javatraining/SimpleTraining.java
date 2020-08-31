package com.grz55.javatraining;

import java.util.*;

public class SimpleTraining {

    public static void main(String[] args) {

        byte b = 127;           //max value for byte
        short s = 32767;        //max value for short

        System.out.println(Long.MAX_VALUE);

        float f = 10.01f;
        double d = 10.02;

        double scientificNumber = 4E3d;
        System.out.println(scientificNumber);

        char c = 'a';

        Integer i = 14;

        short sh = 129;
        byte z = (byte) sh;         //value loops to negative value
        System.out.println("z=" + z);

        double dou = i;
        System.out.println("dou=" + dou);

        double dou2 = 15.3d;
        int number = (int) dou2;
        System.out.println("number=" + number); //cutting to integer number

        System.out.println("ascii of a is " + (int) c);

        int a = 5;
        System.out.println("a=" + a++);
        System.out.println("a=" + a);

        int g = 5;
        System.out.println("g=" + ++g);

        int x = 11;
        x = x ^ 12;   // & AND | OR ^ XOR ~ NOT << LEFT SHIFT >> RIGHT SHIFT >>> ZERO FILL RIGHT SHIFT
        System.out.println("x=" + x);

        boolean isFat = true;
        System.out.println(isFat ? "Lose weight!" : "Eat, don't think");    //ternary operator

        System.out.println("% operator = " + 6 % 4);

        System.out.println("~ " + ~7);

        String text = "text";
        System.out.println("Text length = " + text.length());
        System.out.println("Text to uppercase = " + text.toUpperCase());

        String text2 = "article";

        text2 = text.concat(text2);
        System.out.println("After concat " + text2);

        System.out.println("\\ backslash \n \" \" quotes \n \' \' single quote");

        System.out.println("text text carriage return now \r after returning");
        System.out.println("some text now tab \t text after tab");
        System.out.println("some text now tab\b\b\b and the word removed");

        x = 10;
        String y = "20";
        System.out.println("Adding different types " + x + y);

        System.out.println(Math.max(12, 14));
        System.out.println(Math.min(12, 14));
        System.out.println(Math.sqrt(625));
        System.out.println(Math.abs(-10));
        System.out.println("Now 10 random doubles");

        for (int it = 0; it < 10; it++) {
            System.out.print((int) (Math.random() * 101) + " ");
        }
        System.out.println();

        number = 10;

        switch (number) {
            case 1:
                System.out.println("Number is one");
                break;
            case 10:
                System.out.println("Number is ten");
                break;
            default:
                System.out.println("Number isn't one or ten");
        }

        System.out.println("Every other number until 10");
        for (int iter = 0; iter <= 10; iter = iter + 2) {
            System.out.print(iter + " ");
        }

        System.out.println("\nPrimes with for-each");

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        for (Integer element : primes) {
            System.out.print(element + " ");
        }

        boolean isTall = true;
        if (isTall) {
            System.out.println("\nHe's tall");
        }
    }
}
