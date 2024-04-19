package com.realpractice.day4.coding;

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
        int len = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = sc.nextInt();
        int window=len-n;
        int sum=0;
        for (int i = 0; i < window; i++) {
            sum+=arr[i];
        }
        for (int i = 1; i < n-1; i++) {
            sum=Math.min(sum,sum-arr[i-1]+arr[i+1]);
        }
        System.out.println((Arrays.stream(arr).sum() - sum));
    }
}
