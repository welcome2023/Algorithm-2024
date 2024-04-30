package com.realpractice.day11.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-30 15:43
 * @usage
 */
public class Class04_Java_BaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) { // 注意 while 处理多个 case
            n = sc.nextInt();
        }
        int nBits = countBits(n);
        int m = n + 1;
        while(countBits(m) != nBits){
            m++;
        }
        System.out.println(m);
    }
    private static int countBits(int num) {
        int count = 0;
        while(num > 0){
            count += num & 1;
            num = num >> 1;
        }
        return count;
    }
}
