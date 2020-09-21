package com.grz55.javatraining.algorithms;

import java.io.*;
import java.util.*;

public class MaxArraySum {

    // HACKER RANK
    // Dynamic Programming -> Max Array Sum
    // Complete the maxSubsetSum function below.
    // Still to complete
    static int maxSubsetSum(int[] arr) {
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Provide n - number of elements in the array");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        System.out.println("Provide the array of " + n + " numbers (space separated)");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);
        System.out.println("\n\n" + res);


        scanner.close();
    }
}

