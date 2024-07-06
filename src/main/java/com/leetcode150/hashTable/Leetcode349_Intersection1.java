package com.leetcode150.hashTable;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode349_Intersection1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int j : nums1) {
            set1.add(j);
        }
        for (int j : nums2) {
            set2.add(j);
        }
        for (Integer i : set1) {
            if(set2.contains(i)){
                res.add(i);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}
