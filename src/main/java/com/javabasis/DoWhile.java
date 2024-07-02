package com.javabasis;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-28 17:51
 * @usage
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n=0;
        do {
            a /= 10;
            n++;
        } while (a>0);
        System.out.println(n);
    }
}
