package com.hwtest.window;

import java.util.HashMap;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-04 20:51
 * @usage
 */
public class Class02_LengthSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abacd"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

}
