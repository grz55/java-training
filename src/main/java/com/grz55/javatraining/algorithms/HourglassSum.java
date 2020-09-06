package com.grz55.javatraining.algorithms;

import java.io.IOException;
import java.util.Scanner;

public class HourglassSum {

    // HACKER RANK 2D Array - DS
    //For given array 6x6
    //Counts highest sum of array cells that belong to 'hourglass' shape
    /*

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0

     */
    static int hourglassSum(int[][] arr) {
        int maxSum = -100;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k == 0 || k == 2) {
                        sum += arr[i + k][j];
                        sum += arr[i + k][j + 1];
                        sum += arr[i + k][j + 2];
                    } else {
                        sum += arr[i + k][j + 1];
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum = 0;
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];
        System.out.println("Provide a 6x6 array");
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println("Result = " + result);
        scanner.close();
    }
}
