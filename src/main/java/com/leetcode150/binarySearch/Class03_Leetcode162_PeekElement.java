package com.leetcode150.binarySearch;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:57
 * @usage
 */
public class Class03_Leetcode162_PeekElement {
    public static void main(String[] args) {
        int []arr={1,2,1,3,4,2};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int idx = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[idx]) {
                idx = i;
            }
        }
        return idx;
    }
}
