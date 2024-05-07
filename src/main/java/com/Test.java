package com;

import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Map<String, Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] strs = s.substring(1).split("/");
            for (int j = 0; j < strs.length; j++) {
                if (lists.size()<=j) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put(strs[j], 1);
                    lists.add(map);
                } else {
                    Map<String, Integer> map = lists.get(j);
                    map.put(strs[j], map.getOrDefault(strs[j], 0) + 1);
                }
            }
        }

        String[] str = sc.nextLine().split(" ");
        int k=Integer.parseInt(str[0]);
        String key=str[1];
        System.out.println((Integer) lists.get(k - 1).getOrDefault(key,0));
    }
}
