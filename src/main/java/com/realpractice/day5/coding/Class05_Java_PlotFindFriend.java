package com.realpractice.day5.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-21 23:22
 * @usage
 */
public class Class05_Java_PlotFindFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(map.size());
    }
}
