package com.Leetcode150.backtrack;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 14:05
 * @usage
 */
public class Class05_Leetcode052_NQueen {
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }

    public static int totalNQueens(int n) {
        int[] record = new int[n];
        return backtrack(record, n, 0);
    }

    private static int backtrack(int[] record, int n, int row) {
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < record.length; col++) {
            if (isMatches(record, col, row)) {
                record[row] = col;
                count += backtrack(record, n, row + 1);
            }
        }
        return count;
    }

    private static boolean isMatches(int[] record, int col, int row) {
        for (int k = 0; k < row; k++) {
            if (record[k] == col || (Math.abs(k - row) == Math.abs(record[k] - col))) {
                return false;
            }
        }
        return true;
    }
}
