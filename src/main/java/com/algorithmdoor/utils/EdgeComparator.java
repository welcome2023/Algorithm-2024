package com.algorithmdoor.utils;

import com.algorithmdoor.bean.Edge;

import java.util.Comparator;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-25 21:24
 */
public class EdgeComparator implements Comparator<Edge> {

    @Override
    public int compare(Edge o1, Edge o2) {
        return o1.weight-o2.weight;
    }
}
