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
        String[] strings = sc.nextLine().split(",");
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String strA, String strB) {
                String a = strA.substring(0, 2);
                String b = strB.substring(0, 2);
                if (a.equals(b)) {
                    String numA = strA.substring(2);
                    String numB = strB.substring(2);
                    return numA.compareTo(numB);
                }
                return a.compareTo(b);
            }
        });
        String st = Arrays.toString(strings);
        System.out.print(st.substring(1,st.length()-2));
    }
}
