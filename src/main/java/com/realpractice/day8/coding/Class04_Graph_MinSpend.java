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
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] ints = new int[N][N];
        //初始化数组中的所有值为 -1（表示不连通）
        Arrays.stream(ints).forEach(row -> Arrays.fill(row, -1));
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int P = sc.nextInt();
            if (P == 0) {
                //还没有搭建光纤
                ints[X - 1][Y - 1] = Z;
                ints[Y - 1][X - 1] = Z;
            } else {
                //已经搭建光纤，则成本为 0
                ints[X - 1][Y - 1] = 0;
                ints[Y - 1][X - 1] = 0;
            }
        }
        //基站数组（已经联通的为 1）
        int[] jizhan = new int[N];
        jizhan[0] = 1;
        //被联通的基站
        int indexLink = -1;
        //最小成本
        int minWeight = Integer.MAX_VALUE;
        //总成本
        int count = 0;
        for (int i = 1; i < N; i++) {
            //因为不知道哪个基站被联通了，所有需要进行 N-1 次循环
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (jizhan[j] == 1 && jizhan[k] == 0 && ints[j][k] != -1 && ints[j][k] < minWeight) {
                        //j 与 K 可以联通且成本最低
                        minWeight = ints[j][k];
                        indexLink = k;
                    }
                }
            }
            //说明 y 基站已经被连接了
            jizhan[indexLink] = 1;
            //成本求和
            count += minWeight;
            //初始化最小成本
            minWeight = Integer.MAX_VALUE;
        }

        //数组总和不等于数组长度，说明有基站没有进行连接
        if (Arrays.stream(jizhan).sum() != jizhan.length) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
