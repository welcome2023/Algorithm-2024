package com.hwreal.day11.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-29 20:46
 * @usage
 */
public class Class02_Java_WeiQiAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");
        int[][] qipan1 = new int[19][19];
        int[][] qipan2 = new int[19][19];
        List<int[]> black = new ArrayList<>();
        List<int[]> white = new ArrayList<>();
        for (int i = 0; i < input1.length; i += 2) {
            int row = Integer.parseInt(input1[i]);
            int col = Integer.parseInt(input1[i + 1]);
            qipan1[row][col] = 1;
            qipan2[row][col] = 1;
            black.add(new int[]{row, col});
        }
        for (int i = 0; i < input2.length; i += 2) {
            int row = Integer.parseInt(input2[i]);
            int col = Integer.parseInt(input2[i + 1]);
            qipan1[row][col] = 1;
            qipan2[row][col] = 1;
            white.add(new int[]{row, col});
        }
        int blankCount = handle(black, qipan1, 1);
        int whiteCount = handle(white, qipan2, 1);
        System.out.println(blankCount + " " + whiteCount);
    }

    public static int handle(List<int[]> list, int[][] qipan, int color) {
        int count = 0;
        for (int[] ints : list) {
            int row = ints[0];
            int col = ints[1];
            if (row > 0 && qipan[row - 1][col] == 0) {
                count++;
                qipan[row - 1][col] = color;
            }
            if (row < 18 && qipan[row + 1][col] == 0) {
                count++;
                qipan[row + 1][col] = color;
            }
            if (col > 0 && qipan[row][col - 1] == 0) {
                count++;
                qipan[row][col - 1] = color;
            }
            if (col < 18 && qipan[row][col + 1] == 0) {
                count++;
                qipan[row][col + 1] = color;
            }
        }
        return count;
    }
}
