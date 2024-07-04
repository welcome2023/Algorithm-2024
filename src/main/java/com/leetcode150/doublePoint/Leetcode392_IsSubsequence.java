package com.leetcode150.doublePoint;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是子序列
 */
public class Leetcode392_IsSubsequence {
    public static void main(String[] args) {
        Leetcode392_IsSubsequence obj = new Leetcode392_IsSubsequence();
        System.out.println(obj.isSubsequence("b", "c"));

    }

    public boolean isSubsequence(String s, String t) {
        int left=0;
        int right=0;
        while (left<s.length()&&right<t.length()){
            if(s.charAt(left)==t.charAt(right)){
                left++;
            }
            right++;
        }
        return left==s.length();
    }



}
