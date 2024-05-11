package com.realpractice.day8.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 0:10
 * @usage input:
 * 3
 * 3
 * 1 2 3 0
 * 1 3 1 0
 * 2 3 5 1
 * output:
 * 1
 */
public class Class04_Graph_MinSpend {
    public static void main(String[] args) {
        // 1.初始化二维数组
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][m];
        Arrays.stream(arr).forEach(row -> Arrays.fill(row, -1));
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int p = sc.nextInt();
            if (p == 0) {
                arr[x - 1][y - 1] = z;
                arr[y - 1][x - 1] = z;
            } else {
                arr[x - 1][y - 1] = 0;
                arr[y - 1][x - 1] = 0;
            }
        }
        // 2.定义需要的变量
        int index = -1;
        int minSpend = Integer.MAX_VALUE;
        int totalSpend = 0;
        int[] res = new int[m];
        res[0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (res[j] == 1 && res[k] == 0 && arr[j][k] != -1 && arr[j][k] < minSpend) {
                        index = k;
                        minSpend = arr[j][k];
                    }
                }
            }
            res[index] = 1;
            totalSpend += minSpend;
            minSpend = Integer.MAX_VALUE;
        }
        if (Arrays.stream(res).sum() == res.length) {
            System.out.println(totalSpend);
        } else {
            System.out.println(-1);
        }
    }
}
