package com.leetcode150.arrayAndString;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode541_ReverseString {
    public static void main(String[] args) {
        Leetcode541_ReverseString obj = new Leetcode541_ReverseString();
        System.out.println(obj.reverseStr("a", 2));
    }

    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int end=Math.min(s.length(),i+k);
            reverseString(c, i, end);
        }
        return String.valueOf(c);
    }

    public void reverseString(char[] s, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}