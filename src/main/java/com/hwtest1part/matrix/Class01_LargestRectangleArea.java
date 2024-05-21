package com.hwtest1part.matrix;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-02 21:48
 * @usage
 */
public class Class01_LargestRectangleArea {
    public static void main(String[] args) {
        int[] arr = {1,3, 2, 5};
        System.out.println(largestRectangleArea1(arr));
    }

    public static int largestRectangleArea1(int[] heights) {
        // 1.给heights加两个哨兵
        int len = heights.length;
        if (len == 0) {return 0;}
        if (len == 1) {return heights[0];}
        int res = 0;
        int[] newHeights = new int[len + 2];
        newHeights[0] = 0;
        System.arraycopy(heights, 0, newHeights, 1, len);
        len += 2;
        heights = newHeights;

        // 2.
        Deque<Integer> stack = new ArrayDeque<>(len);
        stack.addLast(0);
        for (int i = 1; i < len; i++) {
            while (heights[i] < heights[stack.peekLast()]) {
                int curHeight = heights[stack.pollLast()];
                int curWidth = i - stack.peekLast() - 1;
                res = Math.max(res, curHeight * curWidth);
            }
            stack.addLast(i);
        }
        return res;
    }
}
