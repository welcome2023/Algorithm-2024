package com.leetcode150.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode349_Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        ArrayList<Integer> res = new ArrayList<>();
        for (int j : nums1) {
            arr1[j]++;
        }
        for (int j : nums2) {
            arr2[j]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] != 0 && arr1[i] != 0) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}
