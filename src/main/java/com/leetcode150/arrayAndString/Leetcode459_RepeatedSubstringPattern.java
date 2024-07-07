package com.leetcode150.arrayAndString;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;

    }
}