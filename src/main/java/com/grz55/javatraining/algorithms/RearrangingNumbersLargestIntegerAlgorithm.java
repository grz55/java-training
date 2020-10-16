package com.grz55.javatraining.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RearrangingNumbersLargestIntegerAlgorithm {

    public static int solution(int n) {
        if (n >= 100000000) {
            return -1;
        }

        String numberString = String.valueOf(n);
        List<Integer> integersList = new ArrayList<>();


        for (int i = 0; i < numberString.length(); i++) {
            integersList.add((int) numberString.charAt(i) - 48);
        }

        StringBuilder returnNumberString = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            Integer max = Collections.max(integersList);
            returnNumberString.append(max);
            integersList.remove(max);
        }

        return Integer.parseInt(returnNumberString.toString());
    }

    private static int largestNumber(int data) {
        int num = data;
        int[] times = new int[10];
        while (num != 0) {
            int val = num % 10;
            times[val]++;
            num /= 10;
        }
        int largestNumber = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < times[i]; j++) {
                largestNumber = largestNumber * 10 + i;
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println("My function result " + solution(19572092));
        long end = System.currentTimeMillis() - begin;
        System.out.println("My function performance time: " + end);
        begin = System.currentTimeMillis();
        System.out.println("Stack function result " + largestNumber(19572092));
        end = System.currentTimeMillis() - begin;
        System.out.println("Stack function performance time: " + end);

    }
}
