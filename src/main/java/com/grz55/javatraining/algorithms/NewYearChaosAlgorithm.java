package com.grz55.javatraining.algorithms;

import java.util.*;

public class NewYearChaosAlgorithm {

    // Complete the minimumBribes function below.

    // HACKER RANK

    static void minimumBribes(int[] q) {

        System.out.println("Too chaotic");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number of test cases");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            System.out.println("Provide the number of people in the queue");
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];
            System.out.println("Provide space separated final state of the queue");
            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

