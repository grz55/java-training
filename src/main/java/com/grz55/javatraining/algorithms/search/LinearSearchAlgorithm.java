package com.grz55.javatraining.algorithms.search;

public class LinearSearchAlgorithm {

    //SOURCE JAVATPOINT

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]) {

        System.out.println("LINEAR SEARCH");

        int[] a1 = {10, 20, 30, 50, 70, 90};

        System.out.println("Printing an array");
        for (int i : a1) {
            System.out.print(i + " ");
        }

        int key = 70;
        System.out.println("\nKey = " + key);
        System.out.println(key + " is found at index: " + linearSearch(a1, key));
    }

}
