package com.algorithmdoor.utils;

import java.util.Comparator;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-23 23:02
 */
    public class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
