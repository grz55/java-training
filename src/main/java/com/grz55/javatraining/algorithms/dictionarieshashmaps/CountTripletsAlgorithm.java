package com.grz55.javatraining.algorithms.dictionarieshashmaps;

import java.io.*;
import java.util.*;

public class CountTripletsAlgorithm {

    private static final Scanner scanner = new Scanner(System.in);

    // HACKER RANK
    // Algorithm counts triplets of geometric progression elements in the list
    // Good only for small n

    static long countTriplets(List<Long> arr, long r) {
        int triplets = 0;
        for (int i = 0; i < arr.size(); i++) {
            long second = arr.get(i) * r;
            long third = second * r;
            int secondIndex;
            int thirdIndex;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == second) {
                    secondIndex = j;
                    for (int k = secondIndex + 1; k < arr.size(); k++) {
                        if (arr.get(k) == third) {
                            thirdIndex = k;
                            triplets++;
                        }
                    }
                }
            }
        }


        return triplets;
    }

    public static void main(String[] args) throws IOException {


        System.out.println("Provide the length of the array: ");
        int n = scanner.nextInt();

        System.out.println("Provide the ratio: ");
        long r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Provide array elements: ");
        String[] arrItems = scanner.nextLine().split(" ");

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, r);

        System.out.println("Result: ");
        System.out.println(ans);
    }
}
