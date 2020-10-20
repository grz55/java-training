package com.grz55.javatraining.algorithms.sorting;

public class BubbleSortAlgorithm {

    //SOURCE JAVATPOINT

    public static void main(String[] args) {

        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        System.out.println("BUBBLE SORT");
        System.out.println("Before sorting");

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nSorted list");

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}