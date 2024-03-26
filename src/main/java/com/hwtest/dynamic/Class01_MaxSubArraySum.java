package com.hwtest.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-24 23:00
 * @usage
 */
public class Class01_MaxSubArraySum {
    public static void main(String[] args) {
        int []arr={1,6,3,-2,4,-1,-9,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int []arr){
        int []dp=new int[arr.length];
        dp[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+arr[i];
            }else {
                dp[i]=arr[i];
            }
        }
        int res=dp[0];
        for (int i = 1; i < arr.length; i++) {
            res=Math.max(res,dp[i]);

        }
        return res;
    }
}
