package com.realpractice.day2.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 21:36
 * @usage 最大 N 个数与最小 N 个数的和,有重叠则输出-1
 */
public class Class06_Array_MaxMinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = sc.nextInt();
        System.out.println(getRes(arr, m));
    }
    public static int getRes(int []arr,int m){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        Arrays.sort(arr);
        int len = map.size();
        int sum = 0;
        for (int i = 0; i < len && m > 0; i++, m--) {
            if (map.firstKey().equals(map.lastKey())) {
                return -1;
            }
            sum += map.firstKey() + map.lastKey();
            map.remove(map.firstKey());
            map.remove(map.lastKey());
        }
        return sum;
    }
}
