package com.Leetcode150.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Class01_Leetcode509_FibNa {
    public static void main(String[] args) {
        System.out.println(getRes(5));
    }

    public static int getRes(int n) {
        if (n < 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[n];
    }
}
