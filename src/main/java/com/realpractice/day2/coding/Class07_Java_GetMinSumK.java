package com.realpractice.day2.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 22:09
 * @usage 给定两个整数数组 array1、array2，数组元素按升序排列。假设从 array1、array2 中
 * 分别取出一个元素可构成一对元素，现在需要取出 k 对元素，并对取出的所有元素求和，
 * 计算和的最小值
 */
public class Class07_Java_GetMinSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String array1 = sc.nextLine();
            String array2 = sc.nextLine();
            String[] arr1 = array1.split(" ");
            String[] arr2 = array2.split(" ");
            int key = sc.nextInt();
            long sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    list.add(Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[j]));
                }
            }
            Collections.sort(list);
            for (int i = 0; i < key; i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
        }
    }
}
