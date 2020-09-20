package com.grz55.javatraining.algorithms;

import java.util.*;

public class IceCreamParlorAlgorithm {

    // HACKER RANK
    // Ice Cream Parlor
    // Which pair of ice creams in stock (indexes from 1, not 0) can boys buy
    // for money given in input
    // For example Amount of money = 8
    // Ice cream array 4 3 2 5 7
    // They can buy 2 4 <- these are indexes of ice creams (counted from 1)

    static void whatFlavors(int[] cost, int money) {
        List<Integer> iceCreamList = new ArrayList<>();
        int indexFirst = -1;
        int indexSecond = -1;
        int second = 0;

        for (int i = 0; i < cost.length; i++) {
            if (cost[i] < money) {
                iceCreamList.add(cost[i]);
                if (iceCreamList.contains(money - cost[i])) {
                    if ((iceCreamList.indexOf(money - cost[i]) == iceCreamList.size() - 1)) {
                        continue;
                    }
                    indexFirst = i + 1;
                    second = money - cost[i];
                    for (int j = 0; j < cost.length; j++) {
                        if (cost[j] == second) {
                            indexSecond = j + 1;
                            printAscending(indexFirst, indexSecond);
                            return;
                        }
                    }
                }
            }
        }
    }

    private static void printAscending(int indexFirst, int indexSecond) {
        if (indexFirst > indexSecond) {
            System.out.println(indexSecond + " " + indexFirst);
        } else
            System.out.println(indexFirst + " " + indexSecond);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many trips?");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            System.out.println("How much money?");
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println("How many ice cream in stock?");
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];
            System.out.println("Provide cost of " + n + " ice creams");
            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}

