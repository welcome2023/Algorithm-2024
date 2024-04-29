package com.realpractice.day10.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-29 19:59
 * @usage
 */
public class Class05_Java_ManagerMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        int[] huiBaoLv = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] fengXian = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] zuiDaTouZi = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] res = new int[m];
        int max = 0;
        for (int i = 0; i < m; i++) {
            int fxA = fengXian[i];
            if (fxA > X) {
                continue;
            }
            //A 的回报率
            int hbA = huiBaoLv[i];
            //A 的投资最大额
            int tzA = zuiDaTouZi[i];
            for (int j = i + 1; j < m; j++) {

                int fxB = fengXian[j];
                if (fxA + fxB > X) {
                    continue;
                }

                int hbB = huiBaoLv[j];
                int tzB = zuiDaTouZi[j];
                //初始化A、B投资额为0
                int touZiA = 0, touZiB = 0;
                if (hbA >= hbB) {
                    //A大于B 的回报，则先紧 A
                    if (N > tzA) {
                        //总投资额大于A的最大投资额，则A投资满，剩下的投资B
                        touZiA = tzA;
                        touZiB = Math.min(N - tzA, tzB);
                    } else {
                        //总投资额不大于A的最大投资额，则全部投资A
                        touZiA = N;
                    }
                } else {
                    //B大于A 的回报，则先紧 B
                    if (N > tzB) {
                        //总投资额大于B的最大投资额，则B投资满，剩下的投资A
                        touZiA = Math.min(N - tzB, tzA);
                        touZiB = tzB;
                    } else {
                        //总投资额不大于A的最大投资额，则全部投资A
                        touZiB = N;
                    }
                }
                //总投资回报
                int huiBao = touZiA * hbA + touZiB * hbB;
                if (huiBao > max) {
                    //总投资回报大于最大回报
                    res = new int[m];
                    res[i] = touZiA;
                    res[j] = touZiB;
                }
            }
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
