package com.grz55.javatraining.algorithms;

import java.util.*;

public class LoopQueriesAlgorithm {

    // HACKER RANK
    // Java Loops II
    // User loop for solving easy query

    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        System.out.println("Number of queries: ");
        int t = in.nextInt();
        System.out.println("Give 3 query parameters (a,b,n)");
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printQueriesResults(a, b, n);
        }


        in.close();
    }

    private static void printQueriesResults(int a, int b, int n) {
        int result = a;
        int twoSquared = 1;
        for (int i = 0; i < n; i++) {
            result += twoSquared * b;
            twoSquared *= 2;
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
