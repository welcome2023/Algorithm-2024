package com.leetcode150.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 11:04
 * @usage
 */
public class Class03_Leetcode198_Rob {
    public static void main(String[] args) {
        int []arr={2,7,9,3,1};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        for (int i : dp) {
            System.out.print(i+" ");
        }
        System.out.println();
        return dp[nums.length-1];
    }
}
