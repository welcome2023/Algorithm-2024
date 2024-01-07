package com.algorithmtest.sort;

/**
 * @createDate 2024-01-02 23:06
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1};
        sort(arr);
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }
}
