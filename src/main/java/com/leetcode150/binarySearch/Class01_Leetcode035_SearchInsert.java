package com.leetcode150.binarySearch;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Class01_Leetcode035_SearchInsert {
    public static void main(String[] args) {
        int []arr={1,2,3,6,8};
        System.out.println(searchInsert(arr, -2));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }else {
                return middle;
        }
    }
        return -1;

}

}
