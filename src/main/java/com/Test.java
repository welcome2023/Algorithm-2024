package com;


import com.sun.deploy.panel.SpecialTableRenderer;

/**
 * @createDate 2023-12-25 22:52
 */
public class Test {

    public static void main(String[] args) {
        int []arr={1,4,5,2,3,8,9,-1,133};
        sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void  sort(int []arr,int l,int r){
        if(l==r){
            return;
        }
       if(l<r){
           int []p=partition(arr,l,r);
           sort(arr,l,p[0]-1);
           sort(arr,p[1]+1,r);
       }
    }

    public static int[] partition(int []arr,int l,int r){
        int less=l-1;
        int more =r;
        while (l<more){
            if (arr[l]<arr[r]){
                swap(arr,++less,l++);
            }
        else if(arr[l]>arr[r]){
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