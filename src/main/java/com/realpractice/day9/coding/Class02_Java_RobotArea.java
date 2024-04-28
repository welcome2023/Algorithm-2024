package com.realpractice.day9.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 10:39
 * @usage
 */
public class Class02_Java_RobotArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums[0];
        int x = nums[1];
        int y = 0;
        int sum = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map.put(arr[0], arr[1]);
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        for (int i = 0; i < list.size() - 1; i++) {
            y += list.get(i).getValue();
            sum += (list.get(i + 1).getKey() - list.get(i).getKey()) * Math.abs(y);
        }
        y += list.get(list.size() - 1).getValue();
        sum += (x - list.get(list.size() - 1).getKey()) * Math.abs(y);
        System.out.println(sum);
    }
}
