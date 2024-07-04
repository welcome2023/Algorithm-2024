package com.leetcode150.doublePoint;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是子序列
 */
public class Leetcode011_MaxArea {
    public static void main(String[] args) {
        Leetcode011_MaxArea obj = new Leetcode011_MaxArea();
        System.out.println(obj.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, area = Integer.MIN_VALUE;
        while (left < right) {
            area=Math.max(area,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<=height[right]){
                left++;
            }else {
                right--;
            }
        }
        return area;
    }


}
