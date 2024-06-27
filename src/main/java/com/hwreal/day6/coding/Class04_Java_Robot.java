package com.hwreal.day6.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-22 23:38
 * @usage 30 12 25 8 19
 */
public class Class04_Java_Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        if (strings.length > 8) {
            System.out.println(-1);
        } else {
            int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
            //最小数是总数除以8，因为最长8小时要搬完。每小时最少要搬min
            int min = Arrays.stream(ints).sum() / 8;
            //最大数是仓库中最大值，因为每个小时只能在一个仓库中搬
            int max = Arrays.stream(ints).max().orElse(0);
            while (min < max) {
                //二分法，取中间值
                int half = (min + max) / 2;
                int time = 0;
                for (int i : ints) {
                    //能整除的直接取商，有余的需要加1
                    time += i / half + (i % half == 0 ? 0 : 1);
                }
                if (time > 8) {
                    min = half + 1;
                } else {
                    max = half;
                }
            }
            System.out.println(min);
        }
    }
}
