package com.grz55.javatraining.algorithms.greedyalgorithms;

import java.io.*;
import java.util.*;

public class MinimumAbsoluteDifferenceAlgorithm {

    // HACKER RANK
    // Given an array of integers, find and print the minimum absolute difference
    // between any two elements in the array.

    static int minimumAbsoluteDifference(int[] arr) {
        int n = arr.length;
        int temp = 0;

        // Array sorting
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int minAbsoluteDifference = absoluteDifference(arr[0], arr[1]);
        int absoluteDifference = minAbsoluteDifference;
        for (int i = 1; i < n - 1; i++) {
            absoluteDifference = absoluteDifference(arr[i], arr[i + 1]);
            if (absoluteDifference < minAbsoluteDifference) {
                minAbsoluteDifference = absoluteDifference;
            }
        }

        return minAbsoluteDifference;
    }

    private static int absoluteDifference(int a, int b) {
        int difference = a - b;
        if (difference >= 0) {
            return difference;
        } else {
            return -difference;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("How many numbers in array?");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        System.out.println("Provide the array (space separated)");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }


        int result = minimumAbsoluteDifference(arr);
        System.out.println("\n" + result);

        scanner.close();
    }
}

