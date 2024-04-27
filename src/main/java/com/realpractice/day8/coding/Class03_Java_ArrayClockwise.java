package com.realpractice.day8.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-27 22:45
 * @usage
 */
public class Class03_Java_ArrayClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int row = Integer.parseInt(str[1]);
        int col = n / row + 1;

        int left = 0;
        int right = col;
        int top = 0;
        int down = row;
        int count = 1;
        String[][] c = new String[row][col];
        while (true) {
            for (int i = left; i < right; i++) {
                // top
                if (n > 0) {
                    c[top][i] = String.valueOf(count++);
                } else {
                    c[top][i] = "*";
                }
                n--;
            }
            top++;
            if (top >= down) {
                break;
            }

            // right
            for (int i = top; i < down; i++) {
                if (n > 0) {
                    c[i][right-1] = String.valueOf(count++);
                } else {
                    c[i][right-1] = "*";
                }
                n--;
            }
            right--;
            if (left >= right) {
                break;
            }
            // down
            for (int i = right; i > left; i--) {
                if (n > 0) {
                    c[down-1][i-1] = String.valueOf(count++);
                } else {
                    c[down-1][i-1] = "*";
                }
                n--;
            }
            down--;
            if (top >= down) {
                break;
            }

            // left
            for (int i = down; i > top; i--) {
                if (n > 0) {
                    c[i-1][left] = String.valueOf(count++);
                } else {
                    c[i-1][left] = "*";
                }
                n--;
            }
            left++;

            if (left >= right) {
                break;
            }
        }

        for (String[] strings : c) {
            for (String s : strings) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }

    }
}
