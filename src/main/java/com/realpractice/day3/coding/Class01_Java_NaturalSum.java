package com.realpractice.day3.coding;

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
        System.out.println(n + "=" + n);
        for (int i = 1; i < n; i++) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sum += j;
                sb.append(j).append("+");
                if (sum == n) {
                    System.out.println(sum + "=" + sb.substring(0, sb.length() - 1));
                    break;
                }
            }
        }
    }

}
