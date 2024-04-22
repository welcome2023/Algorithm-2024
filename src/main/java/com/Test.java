package com;

import java.util.Scanner;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskCapacity = sc.nextInt();
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int overCapacity = 0;
        int time = 0;
        for (int i : arr) {
            if (i + overCapacity > taskCapacity) {
                overCapacity = i + overCapacity - taskCapacity;
            } else {
                overCapacity=0;
            }
            time++;
        }
        while (overCapacity>0){
            overCapacity-=taskCapacity;
            time++;
        }
        System.out.println(time);
    }
}


