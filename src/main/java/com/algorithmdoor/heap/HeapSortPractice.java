package com.algorithmdoor.heap;

import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-17 20:57
 * <p>需求: 已知一个几乎有序的数组,几乎有序是指,如果把数据排好顺序的话,每个元素移动的距离可以不超过k,
 * 并且k相对于数组来说比较小,请选择一个合适的排序算法针对这个数据进行排序;
 */
public class HeapSortPractice {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 8, 5, 3, 2};
        sortedArrDistanceLessK(arr, 5);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void sortedArrDistanceLessK(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index <= Math.min(arr.length, k); index++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for (; index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }
}
