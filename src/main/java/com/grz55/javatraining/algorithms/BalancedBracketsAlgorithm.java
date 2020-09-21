package com.grz55.javatraining.algorithms;

import java.io.*;
import java.util.*;

public class BalancedBracketsAlgorithm {

    // HACKER RANK
    // Stacks/Queues -> Balanced Brackets
    // Return YES or NO depending if string consists balanced brackets
    // {[(])}            NO
    // {{[[(())]]}}      YES

    static String isBalanced(String s) {

        int n = s.length();
        if (n % 2 != 0) {
            return "NO";
        }

        Stack<Character> openingBracketsStack = new Stack<>();
        Stack<Character> closingBracketsStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                openingBracketsStack.push(s.charAt(i));
                closingBracketsStack.push(closingBracketForCharacter(s.charAt(i)));
                continue;
            }
            if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                if (closingBracketsStack.empty()) {
                    return "NO";
                }
                if (s.charAt(i) == closingBracketsStack.peek()) {
                    openingBracketsStack.pop();
                    closingBracketsStack.pop();
                    continue;
                } else {
                    return "NO";
                }
            }
        }
        if (openingBracketsStack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static Character closingBracketForCharacter(char charAt) {
        if (charAt == '{') {
            return '}';
        }
        if (charAt == '[') {
            return ']';
        }
        if (charAt == '(') {
            return ')';
        }
        return '0';
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide number of strings with brackets");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Provide " + t + " strings with brackets");
        List<String> results = new ArrayList<>();
        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();
            String result = isBalanced(s);
            results.add(result);
        }

        for (String result : results
        ) {
            System.out.println(result);
        }

        scanner.close();
    }
}

