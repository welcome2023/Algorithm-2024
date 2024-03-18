package com.hwtest.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-18 22:48
 * @usage 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 */
public class FindKthLargest {
    public static void main(String[] args) {
        int []arr={2,4,1,2,6};
        System.out.println(findKLargest(arr, 1));
    }
    public static int findKLargest(int []arr,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>(new a());
        int res=0;
        for (int j : arr) {
            heap.add(j);
        }
        for (int i = 0; i < k; i++) {
            res = heap.poll();
        }
        return res;

    }


    public static class a implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
}
