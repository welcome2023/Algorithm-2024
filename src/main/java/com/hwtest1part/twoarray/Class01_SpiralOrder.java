package com.hwtest1part.twoarray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-30 16:43
 * @usage
 */
public class Class01_SpiralOrder {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}};
        List<Integer> integers = spiralOrder(arr);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int left = 0, right = matrix[0].length-1;
        int top = 0, down = matrix.length-1;
        while (true) {
            for (int i = left; i <= right; ++i) {
                arr.add(matrix[top][i]);
            }
            top++;
            if (top > down) break;
            for (int i = top; i <= down; ++i) {
                arr.add(matrix[i][right]);
            }
            right--;
            if (left > right) break;
            for (int i = right; i >= left; --i) {
                arr.add(matrix[down][i]);
            }
            down--;
            if (top > down) break;
            for (int i = down; i >= top; --i) {
                arr.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;
        }
        return arr;
    }
}
