package com.hwtest2part.day0521;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-22 0:52
 * @usage
 */
public class Class06_Dynamic_ClimbStaircase {
    public static void main(String[] args) {
        System.out.println(process(3));
    }
    public static int process(int n){
        if(n<=2){
            return 1;
        }
        int[] dp = new int[n+1 ];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
