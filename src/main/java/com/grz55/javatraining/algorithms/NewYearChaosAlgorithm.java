package com.grz55.javatraining.algorithms;

import java.util.*;

public class NewYearChaosAlgorithm {

    // Complete the minimumBribes function below.

    // HACKER RANK
    // New Year Chaos Algorithm
    // For given input for example 1 2 5 3 7 8 6 4
    // What's the minimum changes to happen to get 1 2 3 4 5 6 7 8 (sorted list)
    // If any number from given input is more than 2 positions too far left - print Too chaotic
    // For example 5 1 2 3 4 -> 5 is too far left - print Too chaotic

    static void minimumBribes(int[] q) {
        for (int i = 0; i < q.length; i++) {
            if (q[i] > i + 3) {
                System.out.println("Too chaotic");
                return;
            }
        }

        int temp = 0;
        int bribes = 0;
        boolean bribeHappened = true;

        while (bribeHappened) {
            bribeHappened = false;

            for (int i = 0; i < q.length - 1; i++) {
                if (q[i] > q[i + 1]) {
                    temp = q[i + 1];
                    q[i + 1] = q[i];
                    q[i] = temp;
                    bribes++;
                    bribeHappened = true;
                }
            }
        }
        System.out.println(bribes);
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

