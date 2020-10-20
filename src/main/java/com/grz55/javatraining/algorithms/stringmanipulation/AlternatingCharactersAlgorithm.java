package com.grz55.javatraining.algorithms.stringmanipulation;

import java.io.*;
import java.util.*;

public class AlternatingCharactersAlgorithm {

    // HACKER RANK
    // You are given a string containing characters A and B only.
    // Function returns what is the minimum number of deletions
    // to create a new string that there are no matching adjacent characters.
    // For example ABABABAB - good string
    // BBAAABB - bad string

    static int alternatingCharacters(String s) {
        char[] stringArray = s.toCharArray();
        int deletions = 0;
        for (int i = 0; i < stringArray.length - 1; i++) {
            if (stringArray[i] == stringArray[i + 1]) {
                deletions++;
            }
        }
        return deletions;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Number of strings");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Type " + q + " strings");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);
            System.out.println(result);
        }

        scanner.close();
    }
}

