package com.algorithmtest.practice.heap;

import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-17 21:08
 */
public class SmallHeap {
    public static void main(String []args){
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        heap.add(8);
        heap.add(6);
        heap.add(3);
        heap.add(1);
        heap.add(8);
        while ( !heap.isEmpty()){
            System.out.println(heap.poll());
        }
    }
}
