package com.grz55.javatraining.algorithms;


public class TwoSumAlgorithm {

    // LEET CODE
    // Find which numbers added together give results provided in 'target'

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        System.out.println("Result " + result[0] + "+" + result[1] + "=" + target);
    }

}
