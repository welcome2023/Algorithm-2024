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
        String[] s1 = sc.nextLine().split(" ");
        int num = Integer.parseInt(s1[0]);
        int money = Integer.parseInt(s1[1]);
        int danger = Integer.parseInt(s1[2]);
        int[] huibaolv = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] fengxian = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] touzie = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] res = new int[num];
        int max = 0;
        for (int i = 0; i < num; i++) {
            int sum = 0;
            if (fengxian[i] <= danger && touzie[i] <= money) {
                sum += touzie[i] * huibaolv[i];
            } else if (fengxian[i] <= danger && touzie[i] > money) {
                sum += money * huibaolv[i];
            }
            if (sum > max) {
                max = sum;
                Arrays.fill(res, 0);
                res[i] = touzie[i];
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                int sum = 0;
                if (fengxian[i] + fengxian[j] <= danger && touzie[i] + touzie[j] <= money) {
                    sum += touzie[i] * huibaolv[i];
                    sum += touzie[j] * huibaolv[j];
                    if (sum > max) {
                        max = sum;
                        Arrays.fill(res, 0);
                        res[i] = touzie[i];
                        res[j] = touzie[j];
                    }
                } else if (fengxian[i] + fengxian[j] <= danger && touzie[i] + touzie[j] > money) {
                    int diff = touzie[i] + touzie[j] - money;
                    int value = 0;
                    for (int k = 0; k <= diff; k++) {
                        int sum2 = 0;
                        if (touzie[i] - k >= 0 && touzie[j] - (diff - k) >= 0) {
                            sum2 += (touzie[i] - k) * huibaolv[i];
                            sum2 += (touzie[j] - (diff - k)) * huibaolv[j];
                        }
                        if (sum2 > sum) {
                            sum = sum2;
                            value = k;
                        }
                    }
                    if (sum > max) {
                        max = sum;
                        Arrays.fill(res, 0);
                        res[i] = touzie[i] - value;
                        res[j] = touzie[j] - (diff - value);
                    }
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
