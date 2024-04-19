package com.realpractice.day3.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-16 1:39
 * @usage 输出众数组成的新数组的中位数
 */
public class Class03_Java_ModeAndMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(getRes(arr));
    }

    public static double getRes(int[] arr) {
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().equals(o1.getValue()) ? o1.getKey() - o2.getKey() : o2.getValue() - o1.getValue();
            }
        });
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        heap.addAll(map.entrySet());
        Map.Entry<Integer, Integer> current = heap.peek();
        int a=current.getValue();
        while (!heap.isEmpty()) {
            Map.Entry<Integer, Integer> nowHeap = heap.poll();
            if (nowHeap.getValue().equals(a)) {
                while (nowHeap.getValue() > 0) {
                    list.add(nowHeap.getKey());
                    map.put(nowHeap.getKey(), nowHeap.getValue() - 1);
                }
            }
        }
        return list.size()%2==0?(double)(list.get(list.size()/2-1)+list.get(list.size()/2))/2:(double)(list.get(list.size()/2));
    }
}
