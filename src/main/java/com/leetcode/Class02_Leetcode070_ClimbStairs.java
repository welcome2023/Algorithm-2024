package com.leetcode;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 9:33
 * @usage
 */
public class Class02_Leetcode070_ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[n];
    }
}
