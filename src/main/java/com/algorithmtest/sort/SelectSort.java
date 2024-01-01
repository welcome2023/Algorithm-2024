package com.algorithmtest.sort;

import sun.java2d.pipe.SpanIterator;

/**
 * @createDate 2024-01-01 10:34
 * 在每一次n-i+1次的比较中,选择最小/最大的记录,放在i的位置,
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,2,7,1};
       selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] arr) {
        // 过滤一些垃圾数据
        if (arr == null || arr.length < 2) {
            return;
        }
        //
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                maxIndex = arr[j] > arr[maxIndex] ? j : maxIndex;
            }
            swap(arr, i, maxIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
