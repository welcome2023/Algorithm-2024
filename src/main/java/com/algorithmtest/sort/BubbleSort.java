package com.algorithmtest.sort;

/**
 * @createDate 2024-01-02 22:14
 */
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={5,0,1,4,2,3};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j+1]<arr[j]){
                    // 如果符合要求，则j与j+1 位置上的数做交换
                    swap(arr,j,j+1);

                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }
}
