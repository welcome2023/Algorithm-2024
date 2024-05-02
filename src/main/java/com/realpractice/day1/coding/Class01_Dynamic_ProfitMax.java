package com.realpractice.day1.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 20:52
 * @usage
 */
public class Class01_Dynamic_ProfitMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int aswlen = 0;
        int num = -1;
        for (int i = 1; i < len; i++) {
            int curAsw = 1, subLen = len / i, remainNum = len % i;
            for (int j = 0; j < i; j++) {
                if (j + remainNum >= i) {
                    curAsw = curAsw * (subLen + 1);
                } else {
                    curAsw = curAsw * subLen;
                }
            }
            if (curAsw > aswlen) {
                aswlen = curAsw;
                num = i;
            }
        }
        int resLen = len / num, s1 = len % num;
        for (int j = 0; j < num; j++) {
            if (j + s1 >= num) {
                System.out.print((resLen + 1) + " ");
            } else {
                System.out.print(resLen + " ");
            }
        }
    }
}
