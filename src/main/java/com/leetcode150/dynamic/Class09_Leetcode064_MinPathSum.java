package com.leetcode150.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-03 23:50
 * @usage
 */
public class Class09_Leetcode064_MinPathSum {
    public static void main(String[] args) {
        int [][]arr={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(arr));
    }
    public static int minPathSum(int[][] grid) {
       int row =grid.length;
       int col=grid[0].length;
       int [][]dp=new int[row][col];
       dp[0][0]=grid[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }

        for (int i = 1; i < col; i++) {
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        return dp[row-1][col-1];
    }
}
