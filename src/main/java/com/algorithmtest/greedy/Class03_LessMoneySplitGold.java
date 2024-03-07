package com.algorithmtest.greedy;

import com.algorithmtest.bean.Student;

import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 17:06
 * @usage
 */
public class Class03_LessMoneySplitGold {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(lessMoney(arr));
    }
    public static int lessMoney(int []arr){
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pQ.add(arr[i]);
        }
        int sum=0;
        int cur=0;
        while (pQ.size()>1){
            cur= pQ.poll()+pQ.poll();
            sum+=cur;
            pQ.add(cur);

        }
        return sum;


    }
}
