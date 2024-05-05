package com.realpractice.day4.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 10:07
 * @usage
 */
public class Class02_Java_BalanceSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cha = sc.nextLine().toCharArray();
        int res=0;
        int x=0;
        int y=0;
        for (char c : cha) {
            if (c == 'X') x++;
            if (c == 'Y') y++;
            if (x == y) {
                res++;
            }
        }
        System.out.println(res);
    }
}
