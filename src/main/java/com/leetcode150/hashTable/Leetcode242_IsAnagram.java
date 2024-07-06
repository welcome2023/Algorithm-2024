package com.leetcode150.hashTable;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode242_IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)-'a']--;
        }
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }

        return true;

    }
}
