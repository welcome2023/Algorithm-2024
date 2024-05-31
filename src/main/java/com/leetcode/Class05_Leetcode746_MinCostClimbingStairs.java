package com.leetcode;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 15:03
 * @usage 数组含义
 * 递推公式
 * 初始化数组
 * 循环
 */
public class Class05_Leetcode746_MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = Math.min(cost[0], cost[1]);
        dp[2] = Math.min(dp[0]+cost[2],cost[1]);
        int sum = 0;
        for (int i = 2; i < cost.length; i++) {
            sum += Math.min(dp[i - 2] + cost[i], dp[i-1]);
            dp[i] = sum;
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();

        return dp[cost.length - 1];
    }
}
