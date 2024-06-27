package com.hwreal.day7.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-25 21:24
 * @usage
 */
public class Class03_Java_TeamProgrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] levels = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int res = 0;
        boolean larger;
        for (int i = 0; i < n - 2; i++) {
            int a = levels[i];
            for (int j = i + 1; j < n - 1; j++) {
                int b = levels[j];
                larger = a > b;
                for (int k = j + 1; k < n; k++) {
                    int c = levels[k];
                    if (larger) {
                        res += b > c ? 1 : 0;
                    } else {
                        res += b < c ? 1 : 0;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
