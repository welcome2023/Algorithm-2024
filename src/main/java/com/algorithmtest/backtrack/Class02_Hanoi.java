package com.algorithmtest.backtrack;

import java.io.Flushable;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-12 20:42
 * @usage
 */
public class Class02_Hanoi {
    public static void main(String[] args) {
        int n=3;
        hanoi(3);
    }
    public static void hanoi(int n){
        if(n>0){
            func(n,"左","右","中");
        }
    }

    private static void func(int i, String start, String end, String other) {
        if(i==1){
            System.out.println("move 1 from"+start+" to "+ end);
        }else {
            func(i-1,start,other,end);
            System.out.println("move "+i+" from"+start+" to "+ end);
            func(i-1,other,end,start);
        }
    }



}
