package com.realpractice.day4.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 10:39
 * @usage
 */
public class Class03_Java_AircraftTakeOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0)==o2.charAt(0)?o1.charAt(1)-o2.charAt(1):o1.charAt(0)-o2.charAt(0);
            }
        });
        for (String s : arr) {
            System.out.print(s+" ");
        }
    }
}
