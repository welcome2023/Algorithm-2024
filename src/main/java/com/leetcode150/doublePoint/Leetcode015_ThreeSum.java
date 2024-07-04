package com.leetcode150.doublePoint;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是子序列
 */
public class Leetcode015_ThreeSum {
    public static void main(String[] args) {
        Leetcode015_ThreeSum obj = new Leetcode015_ThreeSum();
        for (List<Integer> list : obj.threeSum(new int[]{-2, 0, 1, 1, 2})) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int len = nums.length - 2;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int sum;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                ArrayList<Integer> list = new ArrayList<>();
                sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                }
            }
        }
        HashSet<List<Integer>> lists = new HashSet<>(res);
        return new ArrayList<>(lists);
    }
}
