package com.hwtest.ordinary;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-30 14:15
 * @usage
 */
public class Class02_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> res = new TreeSet<>();
        for (int j = 0; j < k; j++) {
            double random = Math.random();
            res.add((int) (random * 10) + 1);
        }
        for (Integer re : res) {
            System.out.println(re);
        }
    }
}
