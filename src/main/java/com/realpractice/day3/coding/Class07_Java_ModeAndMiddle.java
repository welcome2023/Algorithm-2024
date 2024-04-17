package com.realpractice.day3.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-16 1:39
 * @usage 输出众数组成的新数组的中位数
 */
public class Class07_Java_ModeAndMiddle {
    public static void main(String[] args) {
        getRes("1 2 3 3 3 4 4 4");
    }
    public static void getRes(String line){
        Map<Integer, Integer> map = new HashMap<>();
        String[] numbers = line.split(" ");

        for (String number : numbers) {
            int i = Integer.parseInt(number);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxCount = 0;
        for (int count : map.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        List<Integer> maxKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxKeys.add(entry.getKey());
            }
        }

        Collections.sort(maxKeys);

        int size = maxKeys.size();
        int res;
        if (size % 2 == 0) {
            res = (maxKeys.get(size / 2) + maxKeys.get(size / 2 - 1)) / 2;
        } else {
            res = maxKeys.get(size / 2);
        }

        System.out.print(res);



    }
}
