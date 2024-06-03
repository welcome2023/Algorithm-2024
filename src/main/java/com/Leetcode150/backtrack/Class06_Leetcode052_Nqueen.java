package com.Leetcode150.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 14:31
 * @usage
 */
public class Class06_Leetcode052_Nqueen {
    static List<List<String>> res = new ArrayList<>();
    public static void main(String[] args) {
        for (List<String> list : getNQueen(4)) {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> getNQueen(int n) {
        char[][] chess = new char[n][n];
        Arrays.stream(chess).forEach(bean -> Arrays.fill(bean, '.'));
        backtrack(n, chess, new ArrayList<String>(), 0);
        return res;
    }

    private static void backtrack(int n, char[][] chess, ArrayList<String> list, int row) {
        if (row == n) {
            res.add(Arrays2list(chess));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isMatches(chess, row, n, col)) {
                chess[row][col] = 'q';
                backtrack(n, chess, list, row + 1);
                chess[row][col] = '.';
            }

        }
    }

    private static List<String> Arrays2list(char[][] chess) {
        ArrayList<String> list = new ArrayList<>();
        for (char[] c : chess) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }


    private static boolean isMatches(char[][] chess, int row, int n, int col) {
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j]=='q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j]=='q') {
                return false;
            }
        }
        return true;
    }
}
