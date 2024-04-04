package com.hwtest.window;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-03 23:37
 * @usage
 */
public class Class01_MaxCore {
    public static void main(String[] args) {
        int []arr={7,2,3,9,1};
        System.out.println(getSum(arr, 3));
    }
    public static int getSum(int[] arr, int k) {
        int windowSize=arr.length-k;
        int sum=0;
        for (int i = 0; i < windowSize; i++) {
            sum+=arr[i];
        }

        int minSize=Integer.MAX_VALUE;
        for (int i = windowSize; i < arr.length; i++) {
            sum+=arr[i]-arr[i-windowSize];
            minSize=Math.min(sum,minSize);
        }
        return Arrays.stream(arr).sum()-minSize;
    }

}
