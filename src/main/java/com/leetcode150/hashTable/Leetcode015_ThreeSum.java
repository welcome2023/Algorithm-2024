package com.leetcode150.hashTable;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode015_ThreeSum {
    public static void main(String[] args) {
        Leetcode015_ThreeSum obj = new Leetcode015_ThreeSum();
        for (List<Integer> is : obj.threeSum(new int[]{3,0,-2,-1,1,2})) {
            for (Integer i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lists = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int  sum=nums[i]+nums[left]+nums[right];
                ArrayList<Integer> list = new ArrayList<>();
                if (sum>0) {
                    right--;
                } else if (sum<0) {
                    left++;
                } else {
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    left++;
                    right--;
                    lists.add(list);
                }

            }
        }
        return new ArrayList<>(lists);
    }
}
