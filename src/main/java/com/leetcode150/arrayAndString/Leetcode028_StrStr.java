package com.leetcode150.arrayAndString;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode028_StrStr {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        // 将字符串转换为字符数组，方便索引操作
        char[] s = haystack.toCharArray(), p = needle.toCharArray();

        // 遍历 haystack 字符串
        for (int i = 0; i < n - m + 1; i++) {
            // 初始化匹配的指针
            int a = i, b = 0;
            // 循环检查 needle 是否在当前位置开始匹配
            while (b < m && s[a] == p[b]) {
                // 如果当前字符匹配，则移动指针
                a++;
                b++;
            }
            // 如果 b 等于 m，说明 needle 已经完全匹配，返回当前位置 i
            if (b == m) return i;
        }

        // 如果遍历完毕仍未找到匹配的子串，则返回 -1
        return -1;
    }
}