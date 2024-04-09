package com.algorithmtest.sort;

/**
 * @createDate 2024-01-01 10:34
 * 在每一次n-i+1次的比较中,选择最小/最大的记录,放在i的位置,
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {7,3,1,2};
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
            swap1(arr, i, maxIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 别轻易用位运算符,内存位置相同,则结果回被清洗成0;
    private static void swap1(int[] arr, int i, int j) {
       arr[i]=arr[i]^arr[j];
       arr[j]=arr[i]^arr[j];
       arr[i]=arr[i]^arr[j];
    }
}
