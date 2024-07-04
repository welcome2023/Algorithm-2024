package com.leetcode150.slipWindow;

import com.sun.org.apache.xalan.internal.xsltc.runtime.StringValueHandler;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode003_LengthOfLongestSubstring {
    public static void main(String[] args) {
        Leetcode003_LengthOfLongestSubstring obj = new Leetcode003_LengthOfLongestSubstring();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));

    }

    public int lengthOfLongestSubstring(String s) {
        int right = 0, res = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        while (right < s.length()) {
            int index=sb.indexOf(String.valueOf(s.charAt(right)));
            if(index==-1){
                sb.append(s.charAt(right));
                right++;
            }else {
                sb.delete(0,index+1);
            }
            res=Math.max(res,sb.length());
        }
        return res==Integer.MIN_VALUE?0:res;
    }
}
