package com.leetcode150.arrayAndString;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode059_GenerateMatrix {
    public static void main(String[] args) {
        Leetcode059_GenerateMatrix obj = new Leetcode059_GenerateMatrix();
        for (int[] ints : obj.generateMatrix(3)) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] arrs = new int[n][n];
        int left = 0;
        int right = n-1 ;
        int top = 0;
        int down = n-1 ;
        int count = 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                arrs[top][i] = count;
                count++;
            }
            top++;
            if (top > down) {
                break;
            }
            for (int i = top; i <= down; i++) {
                arrs[i][right] = count;
                count++;
            }
            right--;
            if (right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                arrs[down][i] = count;
                count++;
            }
            down--;
            if (down < top) {
                break;
            }
            for (int i = down; i >=top; i--) {
                arrs[i][left] = count;
                count++;
            }
            left++;
            if (left > right) {
                break;
            }

        }
        return arrs;
    }
}