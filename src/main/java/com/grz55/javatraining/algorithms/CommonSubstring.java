package com.grz55.javatraining.algorithms;

import java.io.IOException;
import java.util.Scanner;

public class CommonSubstring {

    // HACKER RANK
    // Given two strings, determine if they share a common substring.
    // A substring may be as small as one character.

    static String twoStrings(String s1, String s2) {
        String shorterString;
        String longerString;
        int shorterLength;
        int longerLength;

        if (s1.length() > s2.length()) {
            shorterLength = s2.length();
            shorterString = s2;
            longerString = s1;
            longerLength = s1.length();
        } else {
            shorterLength = s1.length();
            shorterString = s1;
            longerString = s2;
            longerLength = s2.length();
        }

        for (int i = 0; i < shorterLength; i++) {
            for (int j = 0; j < longerLength; j++) {
                if (shorterString.charAt(i) == longerString.charAt(j)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide number of pairs");
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            System.out.println("Provide two strings to check");

            System.out.print("String #1: ");
            String s1 = scanner.nextLine();

            System.out.print("String #2: ");
            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println("Result = " + result);
        }

        scanner.close();
    }
}
