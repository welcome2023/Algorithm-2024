package com.leetcode150.binarySearch;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 22:44
 * @usage
 */
public class Class04_Leetcode153_FindMiddle {
    public static void main(String[] args) {
        int []arr={4,4,6,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
