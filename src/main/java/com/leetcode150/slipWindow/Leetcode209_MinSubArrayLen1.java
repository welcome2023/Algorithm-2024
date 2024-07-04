package com.leetcode150.slipWindow;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode209_MinSubArrayLen1 {
    public static void main(String[] args) {
        Leetcode209_MinSubArrayLen1 obj = new Leetcode209_MinSubArrayLen1();
        System.out.println(obj.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));

    }

    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if(sum>=target){
                    res=Math.min(res,j-i+1);
                    break;
                }
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
