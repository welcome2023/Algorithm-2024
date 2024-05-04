package com.realpractice.day2.coding;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 22:59
 * @usage 给定一个字符串 s，最多只能进行一次变换，
 * 返回变换后能得到的最小字符串（按照字典序
 * 进行比较）。
 */
public class Class03_Heap_ChangeOneChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TreeMap<Integer, Character> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(i, str.charAt(i));
        }
        PriorityQueue<Map.Entry<Integer, Character>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        heap.addAll(map.entrySet());
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            assert heap.peek() != null;
            if (c[i] == heap.peek().getValue()) {
                heap.poll();
            } else {
                Map.Entry<Integer, Character> current = heap.poll();
                getRes(c, current.getKey(), i);
                break;
            }
        }
        for (char c1 : c) {
            System.out.println(c1);
        }
    }
    public static void getRes(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
