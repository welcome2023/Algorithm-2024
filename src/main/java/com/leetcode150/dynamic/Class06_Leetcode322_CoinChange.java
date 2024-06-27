package com.leetcode150.dynamic;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-03 20:40
 * @usage
 */
public class Class06_Leetcode322_CoinChange {
    public static void main(String[] args) {
        int []arr={3,4,5};
        System.out.println(coinChange(arr, 11));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if(dp[j-coins[i]]<Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        for (int i : dp) {
            System.out.print(i+" ");
        }
        System.out.println();
        return dp[amount];
    }
}
