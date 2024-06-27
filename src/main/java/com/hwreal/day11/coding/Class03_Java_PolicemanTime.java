package com.hwreal.day11.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-29 21:39
 * @usage
 */
public class Class03_Java_PolicemanTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long start=System.currentTimeMillis();
        int errorTime = Integer.parseInt(s.substring(0, 2) + s.substring(3));
        String[] num = new String[4];
        num[0] = String.valueOf(s.charAt(0));
        num[1] = String.valueOf(s.charAt(1));
        num[2] = String.valueOf(s.charAt(3));
        num[3] = String.valueOf(s.charAt(4));
        int time;
        int min = Integer.MAX_VALUE;    //小于错误时间的最小时间（第二天）
        int minThan = Integer.MAX_VALUE;    //大于错误时间的最小时间
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(num[i]) > 2) { //首位不能大于2
                continue;
            }
            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(num[i]) == 2 && Integer.parseInt(num[j]) > 3) {  //第一位为2时第二位则不能大于3
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    if (Integer.parseInt(num[k]) >= 6) { //第三位不能大于6
                        continue;
                    }
                    for (int l = 0; l < 4; l++) {
                        time = Integer.parseInt(num[i] + num[j] + num[k] + num[l]);   //重构的时间
                        if (time < errorTime) {
                            min = Math.min(min, time);
                        } else if (time > errorTime) {
                            minThan = Math.min(minThan, time);
                        }
                    }
                }
            }
        }
        String res;
        if (minThan == Integer.MAX_VALUE) { //若重构的时间都小于错误时间，则时间为第二天时间
            res = String.valueOf(min);
        } else {
            res = String.valueOf(minThan);
        }
        System.out.println(res.substring(0, 2) + ":" + res.substring(2));
        long end= System.currentTimeMillis();
        System.out.println("本次执行程序所消耗的时间："+(end-start)+"ms");
    }
}
