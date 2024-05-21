package com.hwtest2part.day0521;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-21 21:18
 * @usage
 */
public class Class02_Java_HashMapNumCount {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int []arr={1,2,1,3,4,5,4,3};
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int target=3;
        System.out.println(map.getOrDefault(target, -1));
    }
}
