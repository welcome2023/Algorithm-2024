package com.realpractice;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-16 2:21
 * @usage 和小明身高差绝对值最小的小朋友排在前面，和小明
 * 身高差绝对值最大的小朋友排在最后，如果两个小朋友和小明身高差一样，则个子较小的小
 * 朋友排在前面。
 */
public class Class07_Java_BodyHightSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 7};
        getRes(arr, 4);
    }

    public static void getRes(int[] arr, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return Integer.compare(o1.getValue(),o2.getValue())==0?Integer.compare(o1.getKey(),o2.getKey()):Integer.compare(o1.getValue(),o2.getValue());
            }
        });
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, Math.abs(j - k));
        }
        heap.addAll(map.entrySet());
        while (!heap.isEmpty()) {
            System.out.println(heap.poll().getKey());
        }

    }
}
