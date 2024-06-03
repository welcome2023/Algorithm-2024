package com.Leetcode150.binarySearch;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:45
 * @usage
 */
public class Class02_Leetcode074_SearchMatrix {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{6,7,8}};
        System.out.println(searchMatrix(arr, 7));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int m=matrix.length;
        int n=matrix[0].length;
        int right = m*n-1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (matrix[middle/n][middle%n] > target) {
                right = middle - 1;
            } else if (matrix[middle/n][middle%n] < target) {
                left = middle + 1;
            }else {
                return true;
            }
        }
        return false;

    }
}
