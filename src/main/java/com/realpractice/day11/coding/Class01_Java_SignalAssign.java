package com.realpractice.day11.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-29 20:22
 * @usage
 */
public class Class01_Java_SignalAssign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());
        Integer[] arr = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        int d = Integer.parseInt(sc.nextLine());
        int count = 0;
        int index = 0;
        HashMap<Integer, Integer> dmap = new HashMap<>();
        while (index < arr.length) {
            dmap.put((int) (Math.pow(2, index)), arr[index]);
            index += 1;
        }



        for (Integer k : dmap.keySet()) {
            if (k >= d) {
                count += dmap.getOrDefault(k, 0);
                dmap.put(k, 0);
            }
        }


        int cap = 0;
        for (int k : dmap.keySet()) {
            cap += k * dmap.getOrDefault(k, 0);
        }
        count += (cap / d);
        System.out.println(count);
    }
}
