package com.hwreal.day3.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-16 2:21
 * @usage 和小明身高差绝对值最小的小朋友排在前面，和小明
 * 身高差绝对值最大的小朋友排在最后，如果两个小朋友和小明身高差一样，则个子较小的小
 * 朋友排在前面。
 */
public class Class02_Java_BodyHightSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[s[1]];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        getRes(arr,s[0]);
    }

    public static void getRes(int[] arr, int height) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().equals(o1.getValue()) ? o1.getKey() - o2.getKey() : o1.getValue() - o2.getValue();
            }
        });
        for (int j : arr) {
            map.put(j, Math.abs(j - height));
        }
        heap.addAll(map.entrySet());
        while (!heap.isEmpty()){
            System.out.print(heap.poll().getKey()+" ");
        }
    }
}
