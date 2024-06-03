package com.Leetcode150.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 15:03
 * @usage 数组含义
 * 递推公式
 * 初始化数组
 * 循环
 * 踏上下标为2的楼梯,耗费体力值为1
 */
public class Class05_Leetcode746_MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
         dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();

        return dp[cost.length ];
    }
}
