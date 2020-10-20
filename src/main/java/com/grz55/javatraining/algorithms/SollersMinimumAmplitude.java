package com.grz55.javatraining.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SollersMinimumAmplitude {

    // Returns a minimum amplitude that can be obtained
    // after the removal of K consecutive elements

    public static int solution(int[] A, int K) {

        int minAmplitude = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - K + 1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < A.length; j++) {
                if ((j >= i) && (j <= (i + K - 1))) {
                    continue;
                } else {
                    list.add(A[j]);
                }
            }
            int min = Collections.min(list);
            int max = Collections.max(list);
            int amplitude = max - min;
            if (amplitude < minAmplitude) {
                minAmplitude = amplitude;
            }
        }
        return minAmplitude;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {5, 3, 6, 1, 3};
        int solution1 = solution(arr, k);
        System.out.println(Arrays.toString(arr));
        System.out.println("K = " + k);
        System.out.println("Result1: " + solution1);
        System.out.println();
        k = 2;
        int[] arr2 = {8, 8, 4, 3};
        int solution2 = solution(arr2, k);
        System.out.println(Arrays.toString(arr2));
        System.out.println("K = " + k);
        System.out.println("Result2: " + solution2);

    }
}
