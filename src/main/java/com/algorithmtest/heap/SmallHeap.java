package com.algorithmtest.heap;

import com.algorithmtest.utils.IntegerComparator;

import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-17 21:08
 */
public class SmallHeap {
    public static void main(String []args){

        PriorityQueue<Integer> heap=new PriorityQueue<>(new IntegerComparator());
        heap.add(8);
        heap.add(6);
        heap.add(3);
        heap.add(1);
        heap.add(8);
        while ( !heap.isEmpty()){
            System.out.println(heap.poll());
            // peek:查看不删除,循环中会内存溢出
            // poll:取出并删除
        }
    }
}
