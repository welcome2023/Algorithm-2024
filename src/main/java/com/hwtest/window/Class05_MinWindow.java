package com.hwtest.window;

import java.util.HashMap;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-05 0:44
 * @usage
 */
public class Class05_MinWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("abaccb", "bc"));
    }
    public static String minWindow(String source, String target) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(char ch : target.toCharArray()) {
            need.put(ch,need.getOrDefault(ch,0) + 1); // 若找到，则++；未找到，则默认为0+1
        }
        int left = 0;
        int right = 0;
        int count = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        while(right < source.length()) {
            char c = source.charAt(right);
            right++;
            // 判断
            if(need.containsKey(c)) {
                window.put(c,window.getOrDefault(c,0) + 1);
                if(window.get(c).equals(need.get(c))) {
                    count++;
                }
            }
            while(count == need.size()) {
                if(right - left < len) {
                    start = left;
                    len = right -left;
                }
                char d = source.charAt(left);
                left++;
                if(need.containsKey(d)) {
                    if(window.get(d).equals(need.get(d))){
                        count--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : source.substring(start, start + len);
    }
}
