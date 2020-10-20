package com.grz55.javatraining.algorithms.greedyalgorithms;

import java.io.*;
import java.util.*;

public class LuckBalanceAlgorithm {

    // HACKER RANK
    // Luck Balance
    // k - number of important contests that can be lost
    // array includes (luck 1st column) (contest importance 2nd column)
    // Every contest lost adds luck
    // Contest won subtracts luck
    // Algorithm counts maximum luck to gain (losing not important contests and
    // losing possible important contests with greatest luck parameter)
    // There can't be more contests lost than given in K parameter

    static int luckBalance(int k, int[][] contests) {

        int n = contests.length;
        int temp = 0;
        int temp2 = 0;

        System.out.println("Bubble sorting the 2-dimensional array");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (contests[j][0] < contests[j + 1][0]) {
                    temp = contests[j][0];
                    temp2 = contests[j][1];
                    contests[j][0] = contests[j + 1][0];
                    contests[j][1] = contests[j + 1][1];
                    contests[j + 1][0] = temp;
                    contests[j + 1][1] = temp2;
                }
            }
        }

        System.out.println("After array sorting");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(contests[i][j] + " ");
            }
            System.out.println();
        }

        int luck = 0;
        int importantContestsLost = 0;

        for (int i = 0; i < n; i++) {
            if (contests[i][1] == 0) {
                luck += contests[i][0];
            } else if (contests[i][1] == 1 && importantContestsLost < k) {
                luck += contests[i][0];
                importantContestsLost++;
            } else {
                luck -= contests[i][0];
            }
        }
        return luck;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide n (array length) and k (maximum important contests to lose)");
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        System.out.println("Provide array 1st column Luck 2nd column Importance (only values 0 or 1) - space separated");
        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);
        System.out.println("\n" + result);

        scanner.close();
    }
}

