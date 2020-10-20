package com.grz55.javatraining.algorithms.sorting;

import java.io.*;
import java.util.*;

public class MarkAndToysAlgorithm {

    // HACKER RANK Mark and Toys algorithm
    // Maximum number of toys that can be bought with given amount of money
    // Array of prices given in input

    static int maximumToys(int[] prices, int k) {

        int n = prices.length;
        int moneyToSpend = 0;
        int toysToBuy = 0;
        int minNow = 0;

        for (int i = 0; i < n; i++) {
            minNow = findMin(prices);
            moneyToSpend += minNow;
            if (moneyToSpend > k) {
                return toysToBuy;
            }
            toysToBuy++;
        }

        return toysToBuy;
    }

    private static int findMin(int[] prices) {
        int beginIndex = 0;
        int min = -1;
        int indexOfMin = -1;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 0) {
                min = prices[i];
                beginIndex = i;
                indexOfMin = i;
                break;
            }
        }

        for (int i = beginIndex; i < prices.length; i++) {
            if (prices[i] <= 0) {
                continue;
            } else if (prices[i] < min) {
                min = prices[i];
                indexOfMin = i;
            }
        }

        prices[indexOfMin] = -1;
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide number of toys and amount of money to spend (space separated)");
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        System.out.println("Provide " + n + " toys prices (space separated)");
        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        System.out.println(result);

        scanner.close();
    }
}

