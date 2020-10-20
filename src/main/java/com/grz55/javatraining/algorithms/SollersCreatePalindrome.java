package com.grz55.javatraining.algorithms;

public class SollersCreatePalindrome {

    //Returns a palindrome of length N consisting K distinct characters

    public static String solution(int N, int K) {
        char[] palindrome = new char[N];
        int middle = N / 2;
        int initAscii = 97;
        int currentAscii = 97;
        for (int i = 0; i <= middle; i++) {
            palindrome[i] = (char) currentAscii;
            palindrome[N - 1 - i] = (char) currentAscii;
            currentAscii++;
            if (currentAscii >= (initAscii + K)) {
                currentAscii = initAscii;
            }
        }
        return new String(palindrome);
    }

    public static void main(String[] args) {
        int N = 10;
        int K = 3;
        System.out.println("N = " + N + " K = " + K);
        String result = solution(N, K);
        System.out.println("Result: " + result);
    }
}
