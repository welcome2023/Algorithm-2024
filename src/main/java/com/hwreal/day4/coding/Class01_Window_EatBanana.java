package com.hwreal.day4.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-19 20:49
 * @usage
 */
public class Class01_Window_EatBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        int window=n-k;
        int res=0;
        for (int i = 0; i < window; i++) {
            res+=array[i];
        }
        int minSize=Integer.MAX_VALUE;
        for (int i = window; i < n; i++) {
            minSize=Math.min(minSize,res);
            res+=array[i]-array[i-window];
        }
        System.out.println(Arrays.stream(array).sum()-minSize);
    }
}
