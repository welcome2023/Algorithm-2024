package com.realpractice.day5.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-21 23:06
 * @usage
 */
public class Class04_Java_Martian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr= str.split("[#&+]");
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
