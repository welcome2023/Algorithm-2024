package com.Leetcode150.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-03 21:57
 * @usage
 */
public class Class08_Leetcode120_MinimumTotal {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        lists.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        lists.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        lists.add(list3);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        lists.add(list4);
        System.out.println(minimumTotal(lists));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        return dp[0][0];
    }
}
