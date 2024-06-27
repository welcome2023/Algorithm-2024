package com.hwreal.day9.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 11:17
 * @usage
 */
public class Class03_Java_CarJump4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        int count=0;
        for (int i = 1; i <= n; i++) {
            if(String.valueOf(i).contains("4")){
                count++;
            }
        }
        System.out.println(n-count);
        long endTime = System.currentTimeMillis();
        System.out.println("程序执行时间：" + (endTime - startTime) + "ms");
    }
}
