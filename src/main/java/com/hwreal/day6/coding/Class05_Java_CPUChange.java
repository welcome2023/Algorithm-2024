package com.hwreal.day6.coding;

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
        String[] st = sc.nextLine().split(" ");
        int arr1Len=Integer.parseInt(st[0]);
        int arr2Len=Integer.parseInt(st[1]);
        int []arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int []arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        for (int i = 0; i < arr1Len; i++) {
            for (int j = 0; j < arr2Len; j++) {
                if(arr1[i]-arr2[j]==sum1-arr1[i]-(sum2-arr2[j])){
                    System.out.println(arr1[i]+" "+arr2[j]);
                    return;
                }
            }
        }
    }
}
