package com;


import jdk.nashorn.internal.parser.Lexer;

import java.util.PriorityQueue;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 8, 5, 3, 2};
        heapSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);

        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }

    }


    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }

    }

    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left+1] > arr[left] ? left+1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (index == largest) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}