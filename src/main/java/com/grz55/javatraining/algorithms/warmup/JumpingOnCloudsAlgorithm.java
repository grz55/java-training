package com.grz55.javatraining.algorithms.warmup;

import java.io.*;
import java.util.*;

public class JumpingOnCloudsAlgorithm {

    // Complete the jumpingOnClouds function below.
    // HACKERRANK
    // Given input for example 0 0 1 0 0 1 0
    // What's minimum number of jumps (1-2 length) that we need to go through the array
    // Result = 4
    // Jump on indexes 1 -> 3 -> 4 -> 6

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int n = c.length;
        for (int i = 0; i < n - 1; ) {
            if ((i + 2) >= n - 1) {
                jumps++;
                return jumps;
            }
            if (c[i + 2] == 0) {
                i = i + 2;
                jumps++;
            } else {
                i = i + 1;
                jumps++;
            }
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        System.out.println("Provide n");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        System.out.println("Provide array of [0,1]");

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println("Result = " + result);
        scanner.close();
    }
}

