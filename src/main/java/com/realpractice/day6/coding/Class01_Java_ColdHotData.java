package com.realpractice.day6.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-21 23:46
 * @usage
 */
public class Class01_Java_ColdHotData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int value = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        TreeSet<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>=value){
                count++;
                set.add(entry.getKey());
            }
        }
        System.out.println(count);
        for (Integer integer : set) {
            System.out.println(integer);
        }

    }
}
