package com.leetcode150.arrayAndString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode054GenerateMatrix {
    public static void main(String[] args) {
        List<Integer> integers = spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (Integer i : integers) {
            System.out.print(i+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1 ;
        int top = 0;
        int down = matrix.length-1 ;

        while (true) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (top > down) {
                break;
            }
            for (int i = top; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }
            down--;
            if (down < top) {
                break;
            }
            for (int i = down; i >=top; i--) {
                list.add(matrix[i][left]);

            }
            left++;
            if (left > right) {
                break;
            }

        }

        return list;
    }
}