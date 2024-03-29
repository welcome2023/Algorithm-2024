package com.hwtest.string;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-29 23:05
 * @usage
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String []strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        for (List<String> list : lists) {
            System.out.println(list);
        }

    }
    public static List<List<String>> groupAnagrams(String[]strs){
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
