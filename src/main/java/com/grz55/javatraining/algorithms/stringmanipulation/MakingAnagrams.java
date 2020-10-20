package com.grz55.javatraining.algorithms.stringmanipulation;

import java.io.*;
import java.util.*;

public class MakingAnagrams {

    // HACKER RANK
    // Strings: Making Anagrams
    // Counts how many characters have to be deleted from two strings for
    // both of them to be anagrams
    static int makeAnagram(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int charactersToDelete = aChars.length + bChars.length;

        for (int i = 0; i < aChars.length; i++) {
            for (int j = 0; j < bChars.length; j++) {
                if (aChars[i] == bChars[j]) {
                    aChars[i] = 0;
                    bChars[j] = 0;
                    charactersToDelete -= 2;
                    break;
                }
            }
        }

        return charactersToDelete;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide first string");
        String a = scanner.nextLine();

        System.out.println("Provide second string");
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);

        scanner.close();
    }
}

