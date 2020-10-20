package com.grz55.javatraining.algorithms.sorting;

public class MergeSortAlgorithm {

    //SOURCE JAVATPOINT

    void merge(int arr[], int beg, int mid, int end) {

        int l = mid - beg + 1;
        int r = end - mid;

        int[] leftarray = new int[l];
        int[] rightarray = new int[r];

        for (int i = 0; i < l; ++i)
            leftarray[i] = arr[beg + i];

        for (int j = 0; j < r; ++j)
            rightarray[j] = arr[mid + 1 + j];


        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (leftarray[i] <= rightarray[j]) {
                arr[k] = leftarray[i];
                i++;
            } else {
                arr[k] = rightarray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = leftarray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = rightarray[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String args[]) {
        System.out.println("MERGE SORT");
        int arr[] = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        System.out.println("Before sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        MergeSortAlgorithm ob = new MergeSortAlgorithm();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
