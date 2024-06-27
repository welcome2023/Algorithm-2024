package com.hwreal.day5.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 16:16
 * @usage 5,3,3,3,1,4,4,4,2
 */
public class Class01_Java_ArrayUniqueAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((o1,o2)->o2.getValue()-o1.getValue());
///*        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//
//                return  o1.getValue().equals(o2.getValue())?o1.getKey()-o2.getKey():o2.getValue()-o1.getValue();
//            }
//        });*/
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        heap.addAll(map.entrySet());
        while (!heap.isEmpty()){
            System.out.println(heap.poll().getKey());
        }
    }
}
