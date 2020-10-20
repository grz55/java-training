package com.grz55.javatraining.algorithms.recursion;

import java.util.*;

public class FibonacciRecursionAlgorithm {

    // HACKER RANK
    // Fibonacci sequence recursive method
    // Fib(0) = 0
    // Fib(1) = 1
    // Fib(n) = Fib(n-1) + Fib(n-2)

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number to count Fibonacci sequence");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Result: ");
        System.out.println(fibonacci(n));
    }

}