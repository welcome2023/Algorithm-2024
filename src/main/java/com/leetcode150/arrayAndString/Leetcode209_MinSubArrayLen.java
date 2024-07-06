package com.leetcode150.arrayAndString;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode209_MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while (right<nums.length){
            sum+=nums[right];
            while (sum>=target){
                res=Math.min(res,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}