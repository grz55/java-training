package com.grz55.javatraining.algorithms.greedyalgorithms;

import java.io.*;
import java.util.*;

public class MinMaxGreedyAlgorithm {

    // HACKER RANK
    // Min Max algorithm
    // Algorithm finds a k-length subarray of the given array
    // which has the lowest difference between the minimum and maximum
    // value of the subarray
    // Returns this value


    static int maxMin(int k, int[] arr) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i : arr) {
            numbersList.add(i);
        }
        Collections.sort(numbersList);
        System.out.println(numbersList.toString());

        int[] subset = new int[k];
        int min = Integer.MAX_VALUE;
        int minSubsetBeginning = -1;

        for (int i = 0; i <= numbersList.size() - k; i++) {
            int difference = numbersList.get(i + k - 1) - numbersList.get(i);
            if (difference < min) {
                min = difference;
                minSubsetBeginning = i;
            }
        }

        int max = numbersList.get(minSubsetBeginning + k - 1);
        min = numbersList.get(minSubsetBeginning);

        System.out.println("Max: " + max + " min: " + min + " minSubsetBeginning: " + minSubsetBeginning);

        return max - min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Number of numbers is array: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Subset length: ");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        System.out.println("Array elements: ");

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);
        System.out.println("Result: ");
        System.out.println(result);

        scanner.close();
    }
}

