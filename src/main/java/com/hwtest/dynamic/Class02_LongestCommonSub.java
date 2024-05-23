package com.hwtest.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-24 23:25
 * @usage
 */
public class Class02_LongestCommonSub {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcdefghj", "bdfj"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < t1.length + 1; i++) {
            for (int j = 1; j < t2.length + 1; j++) {
                if (t1[i - 1] == t2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[t1.length][t2.length];
    }
}
