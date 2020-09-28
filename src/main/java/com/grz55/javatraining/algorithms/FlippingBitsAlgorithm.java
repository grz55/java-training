package com.grz55.javatraining.algorithms;

import java.io.*;
import java.util.*;

public class FlippingBitsAlgorithm {

    // HACKER RANK
    // Flipping bits of Long number

    static long flippingBits(long n) {
        String binaryNumber = Long.toBinaryString(n);
        String resultWithPadding = String.format("%32s", binaryNumber).replaceAll(" ", "0");
        StringBuilder newBinaryNumber = new StringBuilder();
        for (int i = 0; i < resultWithPadding.length(); i++) {
            if (resultWithPadding.charAt(i) == '0') {
                newBinaryNumber.append('1');
            } else {
                newBinaryNumber.append('0');
            }
        }
        return Long.parseLong(newBinaryNumber.toString(), 2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("How many cases?");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Provide integer");
        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);
            System.out.println(result);

        }


        scanner.close();
    }
}

