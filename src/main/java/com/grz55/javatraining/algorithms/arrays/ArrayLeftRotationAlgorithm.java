package com.grz55.javatraining.algorithms.arrays;

import java.io.*;
import java.util.*;

public class ArrayLeftRotationAlgorithm {

    // HACKER RANK
    // Function performs array left rotation
    // Rotations works based on given parameters

    static int[] rotLeft(int[] a, int d) {

        int arrayLength = a.length;
        int rotations = d % arrayLength;
        if (rotations == 0) {
            System.out.println("No rotations needed");
            return a;
        } else {
            int[] newArray = new int[arrayLength];
            int positionIndex = rotations;
            for (int i = 0; i < arrayLength; i++) {
                positionIndex = positionIndex % arrayLength;
                newArray[i] = a[positionIndex];
                positionIndex++;
            }
            System.out.println("Real rotations: " + rotations);
            return newArray;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide n (array size) and d (rotations count) - separate numbers by spaces");
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        System.out.println("Provide the array (separate by spaces)");
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        System.out.println("Final result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}

