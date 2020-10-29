package com.grz55.javatraining.algorithms;


public class TwoSumAlgorithm {

    // LEET CODE
    // Find which numbers added together give results provided in 'target'

    public static int[] twoSum(int[] inputNumbers, int target) {
        int[] resultNumbers = {0, 0};
        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = i + 1; j < inputNumbers.length; j++) {
                if (inputNumbers[i] + inputNumbers[j] == target) {
                    resultNumbers[0] = inputNumbers[i];
                    resultNumbers[1] = inputNumbers[j];
                    return resultNumbers;
                }
            }
        }
        return resultNumbers;
    }

    public static void main(String[] args) {
        int[] inputNumbers = {2, 7, 11, 15};
        int targetSum = 18;
        int[] resultNumbers = twoSum(inputNumbers, targetSum);
        System.out.println("Result " + resultNumbers[0] + "+" + resultNumbers[1] + "=" + targetSum);
    }

}
