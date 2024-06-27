package com.leetcode150.dynamic;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-03 21:13
 * @usage
 */
public class Class07_Leetcode300_LengthOfLIS {
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 19, 101, 18};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res=1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                res=Math.max(res,dp[i]);
            }
        }
        for (int i : dp) {
            System.out.print(i+" ");
        }
        System.out.println();
        return res;

    }
}
