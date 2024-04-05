package com.algorithmtest.utils;

import java.util.Comparator;
import java.util.Map;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-05 23:50
 * @usage
 */
public class MapComparator implements Comparator<Map.Entry<Character,Integer>> {


    @Override
    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        return o2.getValue()-o1.getValue();
    }
}
