package com.grz55.javatraining.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SollersLargestEvenSum {

    // Returns largest possible even sum of K elements
    // in different positions in A array

    public static int solution(int[] A, int K) {

        if (K > A.length) {
            return -1;
        }

        List<Integer> allNumbers = new ArrayList<>();
        for (int i : A) {
            allNumbers.add(i);
        }

        System.out.println(allNumbers.toString());
        Collections.sort(allNumbers, Collections.reverseOrder());
        System.out.println("Sorted: " + allNumbers.toString());
        System.out.println("K " + K);

        List<Integer> largest3Sublist = new ArrayList<>();
        List<Integer> remainingNumbers = new ArrayList<>();

        for (int i = 0; i < allNumbers.size(); i++) {
            if (i < K) {
                largest3Sublist.add(allNumbers.get(i));
            } else {
                remainingNumbers.add(allNumbers.get(i));
            }
        }
        if (largest3Sublist.isEmpty()) {
            return -1;
        }
        System.out.println("Largest 3 numbers " + largest3Sublist.toString());
        System.out.println("Remaining numbers " + remainingNumbers.toString());
        int sum = 0;

        for (int i : largest3Sublist) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

        if (sum % 2 != 0) {
            System.out.println("Sum not even. TO CHANGE");
            int top3SublistSmallestEven = smallestEven(largest3Sublist);
            int top3SublistSmallestOdd = smallestOdd(largest3Sublist);
            int remainingNumbersLargestEven = largestEven(remainingNumbers);
            int remainingNumbersLargestOdd = largestOdd(remainingNumbers);
            if (((top3SublistSmallestEven == -1) || (remainingNumbersLargestOdd == -1)) && ((top3SublistSmallestOdd == -1) || (remainingNumbersLargestEven == -1))) {
                return -1;
            }

            int sum1 = sum - top3SublistSmallestEven + remainingNumbersLargestOdd;
            int sum2 = sum - top3SublistSmallestOdd + remainingNumbersLargestEven;
            if (sum1 >= sum2) {
                return sum1;
            } else {
                return sum2;
            }
        } else {
            return sum;
        }

    }

    public static int smallestOdd(List<Integer> list) {
        List<Integer> odds = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                odds.add(i);
            }
        }
        if (odds.isEmpty()) {
            return -1;
        }
        return Collections.min(odds);
    }

    public static int smallestEven(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        if (evens.isEmpty()) {
            return -1;
        }
        return Collections.min(evens);
    }

    public static int largestOdd(List<Integer> list) {
        List<Integer> odds = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                odds.add(i);
            }
        }
        if (odds.isEmpty()) {
            return -1;
        }
        return Collections.max(odds);
    }

    public static int largestEven(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        if (evens.isEmpty()) {
            return -1;
        }
        return Collections.max(evens);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 8, 2, 6};

        int solution = solution(arr, 3);
        System.out.println("Result: " + solution);

        int[] arr2 = {5, 6, 3, 4, 2};

        solution = solution(arr2, 5);
        System.out.println("Result: " + solution);

        int[] arr3 = {7, 7, 7, 7, 7};

        solution = solution(arr3, 1);
        System.out.println("Result: " + solution);

        int[] arr4 = {1000};

        solution = solution(arr4, 2);
        System.out.println("Result: " + solution);
    }
}
