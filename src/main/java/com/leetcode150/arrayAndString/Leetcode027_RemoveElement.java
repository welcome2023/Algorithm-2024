package com.leetcode150.arrayAndString;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=0;
        while (right<nums.length){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
            right++;

        }
        return left;
    }
}