package com.realpractice.day10.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 22:29
 * @usage
 */
public class Class03_Java_ChaseCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] cnt = line.split(" ");
        int count = Integer.parseInt(cnt[0]);
        int distence = Integer.parseInt(cnt[1]);
        String[] inputs = new String[count];
        for (int i = 0; i < count; i++) {
            inputs[i] = sc.nextLine();
        }
        processTime(count, distence, inputs);
    }

    public static void processTime(int count, int distence, String[] inputs) {
        float mintime = 0;
        for (int i = 0; i < count; i++) {
            int speed = Integer.parseInt(inputs[i]);
            float curtime = (float) distence / speed;
            if (i == 0) {
                mintime = curtime;
                continue;
            }
            if (curtime < mintime - 1) {
                mintime -= 1;
            } else {
                mintime = curtime;
            }
        }
        System.out.println(mintime);
    }
}
