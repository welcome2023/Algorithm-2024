package com.leetcode150.hashTable;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode018_FourSum {
    public static void main(String[] args) {
        Leetcode018_FourSum obj = new Leetcode018_FourSum();
        for (List<Integer> is : obj.fourSum(new int[]{-1000000000,-1000000000,1000000000,-1000000000,-1000000000},294967296) )
        {
            for (Integer i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> lists = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length<4||(nums[0] > 0 && (target < 0))||(nums[nums.length-1] < 0 && target > 0)) {
            return new ArrayList<>();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    ArrayList<Integer> list = new ArrayList<>();
                    if (sum - target > 0) {
                        right--;
                    } else if (sum - target < 0) {
                        left++;
                    } else {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        left++;
                        right--;
                        lists.add(list);
                    }

                }
            }

        }
        return new ArrayList<>(lists);
    }
}
