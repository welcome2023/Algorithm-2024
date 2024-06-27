package com.hwreal.day7.coding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-23 0:53
 * @usage
 * 4,5,6,7,0,1,2
 * 6,4,0,1,2,5,7
 */
public class Class01_Java_Basketball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
            while (!list.isEmpty() && (list.peekFirst() == arr2[left] || list.peekLast() == arr2[left])) {
                if (list.peekFirst() == arr2[left] && left <= i) {
                    list.pollFirst();
                    sb.append("L");
                }
                if (!list.isEmpty() && list.peekLast() == arr2[left] && left <= i) {
                    list.pollLast();
                    sb.append("R");
                }
                left++;
            }
        }
        System.out.println(list.isEmpty() ? sb.toString() : null);
    }
}
