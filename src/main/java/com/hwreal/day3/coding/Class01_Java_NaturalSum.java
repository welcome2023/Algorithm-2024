package com.hwreal.day3.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-18 22:35
 * @usage
 */
public class Class01_Java_NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j <= n; j++) {
                sb.append(j).append("+");
                sum += j;
                if (sum == n) {
                    count++;
                    String str = sb.substring(0, sb.length() - 1);
                    System.out.println(n + "=" + str);
                }
            }
            sum = 0;
        }
        System.out.println("Result:" + count);
    }

}
