package com.leetcode150.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-05 1:01
 * @usage 输入：k = 2, prices = [3,2,6,5,0,3]
 * 输出：7
 */
public class Class012_Leetcode188_MaxProfit {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = prices[i] - prices[i - 1];
        }
        return 0;
    }
}
