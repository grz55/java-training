package com.grz55.javatraining.algorithms;

import java.io.*;
import java.util.*;

public class RepeatedStringAlgorithm {

    // (HACKERRANK.COM)
    // Finding how many 'a' exist in the sequence
    // String is extended if given n is greater than string length
    // Algorithm counts number 'a' in full sequence
    // For given input s = aba, n = 10
    // There 7 'a' letters

    static long repeatedString(String s, long n) {
        long aCounter = 0;
        if (s.length() > n) {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') {
                    aCounter++;
                }
            }
            return aCounter;
        } else {
            long fullString = n / s.length();
            long restString = n % s.length();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    aCounter++;
                }
            }
            aCounter = aCounter * fullString;
            for (int i = 0; i < restString; i++) {
                if (s.charAt(i) == 'a') {
                    aCounter++;
                }
            }
            return aCounter;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Provide string");
        String s = scanner.nextLine();
        System.out.println("Provide n");
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println("\nResult = " + result);

        scanner.close();
    }
}

