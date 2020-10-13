package com.grz55.javatraining.algorithms;

import java.io.*;
import java.util.*;

public class SherlockValidStringAlgorithm {

    // HACKER RANK
    // Sherlock and the Valid String Algorithm
    // Algorithm returns YES if:
    // - all characters of the string appear the same number of times
    // - you can remove just 1 character at 1 index in the string, and the remaining characters will occur the same number of times
    // In other cases returns NO

    static String isValid(String s) {
        Map<Character, Integer> lettersSet = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!lettersSet.containsKey(s.charAt(i))) {
                lettersSet.put(s.charAt(i), 1);
            } else {
                lettersSet.replace(s.charAt(i), lettersSet.get(s.charAt(i)) + 1);
            }
        }

        Set<Integer> valuesSet = new HashSet<>(lettersSet.values());
        List<Integer> valuesList = new ArrayList<>(lettersSet.values());

        int occurencesSum = 0;
        for (Integer integer : valuesList) {
            occurencesSum += integer;
        }

        if (valuesSet.size() == 1) {
            return "YES";
        } else if (valuesSet.size() == 2) {
            Object[] objects = valuesSet.toArray();
            int smaller = Math.min((Integer) objects[0], (Integer) objects[1]);
            if (Collections.frequency(valuesList, 1) == 1 || Collections.frequency(valuesList, smaller + 1) == 1) {
                return "YES";
            }
            return "NO";
        } else {
            return "NO";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Provide string: ");
        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.println("Result:");
        System.out.println(result);

        scanner.close();
    }
}

