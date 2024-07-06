package com.leetcode150.hashTable;

import sun.security.util.math.ImmutableIntegerModuloP;

import java.util.HashMap;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode454_FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int res=0;

        for (int value : nums1) {
            for (int k : nums2) {
                int sum = value + k;
                map1.put(sum, map1.getOrDefault(sum, 0) + 1);
            }
        }

        for (int j : nums3) {
            for (int k : nums4) {
                int sum = j + k;
                if (map1.containsKey(-sum)) {
                    res += map1.get(-sum);
                }
            }

        }
      return res;
    }
}
