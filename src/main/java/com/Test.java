package com;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @createDate 2023-12-25 22:52
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {7,3,1,2,6};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0&&arr[j]>arr[j+1]; j--) {
                swap(arr,j,j+1);

            }

        }
    }


    public static void swap(int []arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }


}
