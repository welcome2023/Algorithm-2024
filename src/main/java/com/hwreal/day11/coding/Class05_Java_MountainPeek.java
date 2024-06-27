package com.hwreal.day11.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-30 16:12
 * @usage
 */
public class Class05_Java_MountainPeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .split(",");
        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        int len = ints.length;
        int res = 0;
        if (len == 1) {
            System.out.println(ints[0] > 0 ? 1 : 0);
        } else {
            for (int i = 0; i < len; i++) {
                if (i == 0) {
                    //第一个山脉
                    if (ints[i] > ints[i + 1]) {
                        res++;
                    }
                } else if (i == len - 1) {
                    //最后一个山脉
                    if (ints[i] > ints[i - 1]) {
                        res++;
                    }
                } else if (ints[i] > ints[i - 1] && ints[i] > ints[i + 1]) {
                    res++;
                }
            }

            System.out.println(res+" ");
        }
    }

}
