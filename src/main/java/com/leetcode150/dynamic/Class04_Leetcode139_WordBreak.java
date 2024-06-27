package com.leetcode150.dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 11:29
 * @usage
 */
public class Class04_Leetcode139_WordBreak {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {{
            add("ab");
            add("bc");
            add("cd");
            add("e");
            add("f");
        }};
        System.out.println(wordBreak("abcdef", list));

    }


    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String subStr = s.substring(j, i);
                if (set.contains(subStr) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


}
