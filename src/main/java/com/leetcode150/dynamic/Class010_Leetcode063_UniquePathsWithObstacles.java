package com.leetcode150.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-04 0:06
 * @usage
 */
public class Class010_Leetcode063_UniquePathsWithObstacles {
    public static void main(String[] args) {
        int [][]arr={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int []dp=new int[n];
        dp[0]=obstacleGrid[0][0]==0?1:0;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if(obstacleGrid[i][j]==1){
                    dp[j]=0;
                    continue;
                }
                if(j>=1&&obstacleGrid[i][j-1]==0){
                    dp[j]+=dp[j-1];
                }
            }
            for (int a : dp) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        return dp[n-1];

    }
}
