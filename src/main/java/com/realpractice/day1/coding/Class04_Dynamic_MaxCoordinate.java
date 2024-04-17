package com.realpractice.day1.coding;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 1:42
 * @usage
 */
public class Class04_Dynamic_MaxCoordinate {
    public static void main(String[] args) {
        int []arr={-5,1,6,0,-7};
        System.out.println(getRes(arr, -5));
    }
    public static int getRes(int[] arr, int num) {
        int max = 0;
        int[] dp = new int[arr.length+1];
        dp[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            dp[i] = dp[i - 1] + arr[i-1];
            if (arr[i-1] == num ) {
                dp[i]+=arr[i-1]/Math.abs(arr[i-1]);
            }
            max= Math.max(max,dp[i]);
        }
        return max;
    }
}
