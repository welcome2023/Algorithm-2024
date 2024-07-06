package com.leetcode150.arrayAndString;

import javafx.scene.control.TableFocusModel;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode704_SearchBinary {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left<=right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left=mid+1;
            } else if(nums[mid]> target) {
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}