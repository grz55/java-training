package com.grz55.javatraining.algorithms.stringmanipulation;

import java.util.Scanner;

public class StringPalindromeAlgorithm {

    // HACKER RANK JAVA STRING REVERSE

    public static String isPalindrome(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return "No";
            }
        }
        return "Yes";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(isPalindrome(a));

    }
}
