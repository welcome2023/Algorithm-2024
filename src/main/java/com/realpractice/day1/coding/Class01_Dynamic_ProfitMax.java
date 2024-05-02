package com.realpractice.day1.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 20:52
 * @usage int resAsw = 0;
 *
 */
public class Class01_Dynamic_ProfitMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int treeHei = sc.nextInt();
        int count = 0; //用于存储当前最优树的段数
        int maxMoney = 0; //用于存储当前最优解的利润(最大利润)
        for (int i = 1; i < treeHei; i++) {
            int curMoney = 1, subLen = treeHei / i, remainLen = treeHei % i;
            for (int j = 0; j < i; j++) {
                if (j + remainLen >= i) {
                    curMoney *= (subLen + 1);
                } else {
                    curMoney *= subLen;
                }
            }
            if (curMoney > maxMoney) {
                maxMoney = curMoney;
                count = i;
            }
        }
        int subLen = treeHei / count, remainLen = treeHei % count;
        for (int i = 0; i < count; i++) {
            if (i + remainLen >= count) {
                System.out.print(subLen + 1 + " ");
            } else {
                System.out.print(subLen + " ");
            }
        }
    }
}
