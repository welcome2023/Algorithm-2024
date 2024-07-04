package com.leetcode150.doublePoint;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是子序列
 */
public class Leetcode167_TwoSum {
    public static void main(String[] args) {
        Leetcode167_TwoSum obj = new Leetcode167_TwoSum();
        for (int i : obj.twoSum(new int[]{1, 2, 3}, 4)) {
            System.out.print(i + " ");
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0, right = 0;
        boolean flag = true;
        for (left = 0; left < length; left++) {
            for (right = left + 1; right < length; right++) {
                if (numbers[left] + numbers[right] == target) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }

        }
        return new int[]{left + 1, right + 1};
    }


}
