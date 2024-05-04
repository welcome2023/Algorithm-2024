package com.realpractice.day2.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-16 0:52
 * @usage 寻找最富裕的小家庭
 */
public class Class05_Java_MostRichFamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] ints = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int father = sc.nextInt();
            int child = sc.nextInt();
            map.put(father, map.getOrDefault(father, ints[father - 1]) + ints[child - 1]);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            max = Math.max(m.getValue(), max);
        }

        System.out.println(max);
    }
}
