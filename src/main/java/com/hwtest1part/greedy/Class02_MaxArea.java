package com.hwtest1part.greedy;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-21 22:03
 * @usage
 */
public class Class02_MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea2(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea1(int[] height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max((j - i) * Math.min(height[i], height[j]), max);
            }
        }
        return max;
    }


    public static int maxArea2(int[] height) {
        int max = 0, l = 0, r = height.length - 1;
        while (l < r) {
            max = Math.max((r - l) * Math.min(height[l], height[r]), max);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
