package com.realpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 21:36
 * @usage 最大 N 个数与最小 N 个数的和,有重叠则输出-1
 */
public class Class06_Array_MaxMinN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int[] ary = new int[m];
            for (int i = 0; i < ary.length; i++) {
                ary[i] = scanner.nextInt();
            }
            int n = scanner.nextInt();
            int resAry =getRes(ary, n);
            System.out.println(resAry);
        }
    }

    public static int getRes(int[] ary, int n) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for (int a : ary) {
            set.add(a);
        }
        int sz = set.size();
        if (2 * n > sz) {
            return res;
        }


        int count = 0;
        for (Integer s : set) {
            ary[count++] = s;
        }
        Arrays.sort(ary, 0, count);
        res = 0;
        for (int i = 0; i < n; i++) {
            res += ary[i] + ary[count - 1 - i];
        }
        return res;
    }
}
