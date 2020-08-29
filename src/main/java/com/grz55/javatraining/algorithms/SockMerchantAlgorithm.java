package com.grz55.javatraining.algorithms;

import java.io.*;
import java.util.*;

public class SockMerchantAlgorithm {

    // Complete the sockMerchant function below (HACKERRANK.COM)
    // Finding pairs of numbers in given array
    // Function returns number of pairs
    // For given input 1 2 1 2 1 3 2
    // There are 2 pairs

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i <= (n - 2); i++) {
            if ((ar[i] > 0) && (ar[i] <= 100)) {
                for (int j = (i + 1); j <= (n - 1); j++) {
                    if (ar[i] == ar[j]) {
                        pairs++;
                        ar[i] = 0;
                        ar[j] = 0;
                        break;
                    }
                }
            }
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Provide array size (n)");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];
        System.out.println("Provide array (0<ar<=100) separate with spaces");
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Given array");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        int result = sockMerchant(n, ar);

        System.out.println("Result = " + result);

        scanner.close();
    }
}

