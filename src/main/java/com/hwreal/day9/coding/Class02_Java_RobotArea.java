package com.hwreal.day9.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 10:39
 * @usage
 */
public class Class02_Java_RobotArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int xEnd = Integer.parseInt(str[1]);
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(arr);
        }
        int y = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                int x=xEnd-list.get(i)[0];
                sum+=x*Math.abs(y+list.get(i)[1]);
            } else {
                int x = list.get(i + 1)[0] - list.get(i)[0];
                y = Math.abs(y + list.get(i)[1]);
                sum += x * y;
            }
        }
        System.out.println(sum);
    }
}
