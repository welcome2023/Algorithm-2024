package com.algorithmtest.sort;


/**
 * @createDate 2024-01-10 22:11
 * 需求:给定一个数组,和一个数,请把小于等于num的数放在数组的左边,大于num的数放在数组的右边
 */
public class QuickSort {
    public static void main(String[] args) {
        int []arr={3,5,7,1,2};
        quickSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void quickSort(int []arr){
        if(arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int []arr,int l,int r){
        if(l<r){
        //    swap(arr,l+(int)(Math.random()*(r-l+1)),r);
            int []p=partition(arr,l,r);
            quickSort(arr,l,p[0]-1);
            quickSort(arr,p[1]+1,r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        //arr[r]=pivot
        int less=l-1;
        int more=r;
        while (l<more){
            if(arr[l]<arr[r]){
                swap(arr,++less,l++);
            } else if (arr[l]>arr[r]) {
                swap(arr,--more,l);
            }else {
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }

    public static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }
}
