package com.hwtest2part.day0521;

import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-21 21:27
 * @usage
 */
public class Class03_Java_TopKMax {
    public static void main(String[] args) {
        System.out.println(getTopK(new int[]{4, 1, 2, 5, 3}, 2));
    }

    public static int getTopK(int []arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : arr) {
            if(minHeap.size()<k||i>minHeap.peek()){
                minHeap.add(i);
            }
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
