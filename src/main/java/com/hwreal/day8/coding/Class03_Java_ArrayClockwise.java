package com.hwreal.day8.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-27 22:45
 * @usage
 */
public class Class03_Java_ArrayClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int row = arr[1];
        if (n <= row) {
            for (int i = 0; i < row; i++) {
                System.out.println(i < arr.length ? arr[i] : "*");
            }
        } else {
            int col = n / row + 1;
            String[][] ints = new String[ row][col];
            int left = 0;
            int right = col - 1;
            int top = 0;
            int down = row - 1;
            int count = 1;
            while (true) {
                for (int i = left; i <= right; i++) {
                    if (n > 0) {
                        ints[top][i] = String.valueOf(count++);
                    } else {
                        ints[top][i] = "*";
                    }
                    n--;
                }
                top++;
                if (top > down) break;
                for (int i = top; i <= down; i++) {

                    if (n > 0) {
                        ints[i][right] = String.valueOf(count++);
                    } else {
                        ints[i][right] = "*";
                    }
                    n--;
                }
                right--;
                if (left > right) break;
                for (int i = right; i >= left; i--) {
                    if (n > 0) {
                        ints[down][i] = String.valueOf(count++);
                    } else {
                        ints[down][i] = "*";
                    }
                    n--;
                }
                down--;
                if (top > down) break;
                for (int i = down; i >= top; i--) {
                    if (n > 0) {
                        ints[i][left] = String.valueOf(count++);
                    } else {
                        ints[i][left] = "*";
                    }
                    n--;
                }
                left++;
                if (left > right) break;
            }
            for (String[] anInt : ints) {
                for (String s : anInt) {
                    System.out.print(s+"\t");
                }
                System.out.println();
            }
        }

    }
}
