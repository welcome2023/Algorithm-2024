package com.hwtest.matrix;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-02 22:36
 * @usage
 */
public class Class02_MaximalRectangle {
    public static void main(String[] args) {
        int [][]arr={{1,0,1,0},{1,1,1,1},{1,1,1,0}};
        System.out.println(maximalRectangle(arr));

    }
    public static int maximalRectangle(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        //存放每行高度
        List<int[]> allHeights = new ArrayList<>();
        for (int i = m - 1; i >= 0; i--) {
            int[] heights = new int[n + 2];
            for (int j = 0; j < n; j++) {
                int k = i;
                while (k >= 0 && matrix[k][j] == 1) {
                    heights[j + 1]++;
                    k--;
                }
            }
            allHeights.add(heights);
        }





        int res = 0;
        for (int[] heights : allHeights) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < heights.length; i++) {
                while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                    int cur = stack.pop();
                    int val = heights[cur] * (i - stack.peek() - 1);
                    res = Math.max(res, val);
                }
                stack.push(i);
            }
        }
        return res;
    }

}
