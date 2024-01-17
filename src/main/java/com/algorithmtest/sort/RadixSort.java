package com.algorithmtest.sort;

import javafx.beans.binding.When;

import java.util.zip.CheckedOutputStream;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-17 22:06
 */
public class RadixSort {

    public static void radixSort(int[]arr){
        if(arr==null||arr.length<2){
            return;
        }
        radixSort(arr,0,arr.length-1,maxBits(arr));
    }

    public static void radixSort(int []arr,int l,int r,int digit){
        final int radix=10;
        int i=0,j=0;
        int []bucket =new int[r-l+1];
        for (int d = 0; d <= digit; d++) {
            // 10 个空间
            // count[0] 当前位(d位) 是0的数字有多少个
            int []count=new int[radix];
            for ( i = l; i < r; i++) {
                count[i]=count[i]+count[i-1];
            }
            for ( i = r; i >= l; i--) {
                j=getDigit(arr[i],d);
                bucket[count[j]-1]=arr[i];
                count[j]--;
            }
            for (i = l,j=0; i <= r; i++,j++) {
                arr[i]=bucket[j];
            }
        }
    }

    private static int getDigit(int x, int d) {
        return ((x/((int)Math.pow(10,d-1)))%10);
    }

    private static int maxBits(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);

        }
        int res=0;
        while (max!=0){
            res++;
            max/=10;
        }

        return res;
    }




}
