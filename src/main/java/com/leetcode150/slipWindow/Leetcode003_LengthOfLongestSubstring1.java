package com.leetcode150.slipWindow;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode003_LengthOfLongestSubstring1 {
    public static void main(String[] args) {
        Leetcode003_LengthOfLongestSubstring1 obj = new Leetcode003_LengthOfLongestSubstring1();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));

    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, res = Integer.MIN_VALUE;
        while (right < s.length()) {
            int index = s.indexOf(s.charAt(right),left);
            if (index != right) {
                left = index + 1;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}
