package com;

import java.util.Scanner;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        in.close();
        long startTime = System.currentTimeMillis();
        int nL = 0; //n 的位数
        while (n >= Math.pow(10, nL)) {
            nL++;
        }
        for (int i = nL; i > 0; i--) {
            int gw = n % (int) Math.pow(10, i) / (int) Math.pow(10, i - 1); //i 的位数
            if (gw > 4) {
                n -= (int) Math.pow(10, i - 1);
            }
            int a = n / (int) Math.pow(10, i - 1);
            int b = a / 10;
            n -= b * (int) Math.pow(10, i - 1);
        }
        System.out.println(n);
        long endTime = System.currentTimeMillis();
        System.out.println("程序执行时间：" + (endTime - startTime) + "ms");
    }
}


