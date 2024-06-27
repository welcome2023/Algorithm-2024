package com.hwreal.day8.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 0:16
 * @usage
 */
public class Class05_Java_TestExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array[0]; i++) {
            map.put(i + 1, sc.nextInt());
            sc.nextLine();
        }
        LinkedHashMap<String, Integer> resMap = new LinkedHashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> entries = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < array[1]; i++) {
            int[] res = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int j = 0; j < res.length; j++) {
                sum += map.get(res[j]);
            }
            resMap.put("T"+(i+1),sum);
        }
        entries.addAll(resMap.entrySet());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
        }




    }

}
