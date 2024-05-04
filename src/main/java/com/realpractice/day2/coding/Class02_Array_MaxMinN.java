package com.realpractice.day2.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 21:36
 * @usage 最大 N 个数与最小 N 个数的和,有重叠则输出-1
 */
public class Class02_Array_MaxMinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        if (set.size() < count * 2) {
            System.out.println(-1);
        } else {
            int res = 0;
            for (int i = 0; i < count; i++) {
                res += set.pollFirst() + set.pollLast();
            }
            System.out.println(res);
        }
    }
}
