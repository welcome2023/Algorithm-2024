package com.realpractice.day9.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 16:06
 * @usage 12 7 2 1 1 -1 13
 * 001000010000 001000010000 001000010000 001000010000 001000010000 001000010000 001000010000
 */
public class Class04_Java_Mirror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();
        String[] infoArr = info.split(" ");
        int w = Integer.parseInt(infoArr[0]);
        int h = Integer.parseInt(infoArr[1]);
        int x = Integer.parseInt(infoArr[2]);
        int y = Integer.parseInt(infoArr[3]);
        int sx = Integer.parseInt(infoArr[4]);
        int sy = Integer.parseInt(infoArr[5]);
        int t = Integer.parseInt(infoArr[6]);
        int[][] arr = new int[h][w];
        // 1.构造二维矩阵
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            char[] temp = line.toCharArray();
            for (int j = 0; j < w; j++) {
                arr[i][j] = temp[j] - '0';
            }
        }
        // 2.
        int count = 0;
        while (t >= 0) {
            // 判断是否二维数据元素是否为1，先y后x
            if (arr[y][x] == 1) {
                count++;
            }
            if (x + sx < 0) {
                //左侧边缘反射
                sx = -sx;
            } else if (x + sx > w - 1) {
                //右侧边缘反射
                sx = -sx;
            }

            if (y + sy < 0) {
                //上侧边缘反射
                sy = -sy;
            } else if (y + sy > h - 1) {
                //下侧边缘反射
                sy = -sy;
            }

            x += sx;
            y += sy;
            t--;
        }
        System.out.println(count);
    }

}
