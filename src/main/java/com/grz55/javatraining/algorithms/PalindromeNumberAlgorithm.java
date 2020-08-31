package com.grz55.javatraining.algorithms;

class PalindromeNumberAlgorithm {

    // LEET CODE
    // Find if provided number is a palindrome (used conversion to String)

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuffer afterReverse = new StringBuffer();

        for (int i = number.length() - 1; i >= 0; i--) {
            afterReverse.append(number.charAt(i));
        }

        return number.equals(afterReverse.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(3223));
        System.out.println(isPalindrome(621));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(1112111));
        System.out.println(isPalindrome(-12));


    }
}
