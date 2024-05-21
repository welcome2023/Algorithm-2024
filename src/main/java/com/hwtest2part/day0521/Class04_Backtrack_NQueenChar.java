package com.hwtest2part.day0521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-21 23:15
 * @usage
 */
public class Class04_Backtrack_NQueenChar {
    static List<List<String>> res=new ArrayList<>();

    public static void main(String[] args) {
        for (List<String> list : process(4)) {
            for (String s : list) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> process(int n) {
        char[][] chess = new char[n][n];
        for (char[] c : chess) {
            Arrays.fill(c, '.');
        }
        bracktrack(n, 0, chess, new ArrayList<String>());
        return res;
    }

    private static void bracktrack(int n, int row, char[][] chess, ArrayList<String> list) {
        if (n == row) {
            res.add(arrays2List(chess));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(chess, n, row, col)) {
                chess[row][col] = 'q';
                bracktrack(n, row + 1, chess, list);
                chess[row][col] = '.';
            }
        }
    }

    private static boolean isValid(char[][] chess, int n, int row, int col) {
        for (int k = 0; k < row; k++) {
            if (chess[k][col] == 'q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j <n; i--, j++) {
            if (chess[i][j] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static List<String> arrays2List(char[][] chess) {
        ArrayList<String> list = new ArrayList<>();
        for (char[] c : chess) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }
}
