package com.realpractice.day6.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-23 0:11
 * @usage
 */
public class Class05_Java_CPUChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr1);
        boolean flag=false;
        for (int j : arr1) {
            for (int k : arr2) {
                if (j - k == Arrays.stream(arr1).sum() - j - Arrays.stream(arr2).sum() + k) {
                    System.out.println(j + "----" + k);
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
    }
}
