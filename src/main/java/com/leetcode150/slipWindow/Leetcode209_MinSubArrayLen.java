package com.leetcode150.slipWindow;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode209_MinSubArrayLen {
    public static void main(String[] args) {
        Leetcode209_MinSubArrayLen obj = new Leetcode209_MinSubArrayLen();
        System.out.println(obj.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));

    }

    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=target){
                res=Math.min(res,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
