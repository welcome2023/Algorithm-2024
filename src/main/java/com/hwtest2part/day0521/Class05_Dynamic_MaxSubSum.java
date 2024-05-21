package com.hwtest2part.day0521;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-22 0:40
 * @usage
 */
public class Class05_Dynamic_MaxSubSum {
    public static void main(String[] args) {
        int []arr={1,3,-1,3,-5};
        System.out.println(process(arr));
    }
    public static int process(int []arr){
        int[] dp = new int[arr.length];
        dp[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(dp[i-1]<0){
                dp[i]=arr[i];
            }else {
                dp[i]=dp[i-1]+arr[i];
            }
        }
       return Arrays.stream(dp).max().orElse(0);
    }
}
