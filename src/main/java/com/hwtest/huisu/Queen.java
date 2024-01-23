package com.hwtest.huisu;


import java.util.*;

public class Queen {
    public static void main(String[] args) {
        List<List<String>> lists = solveNQueens(4);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }


    // List<List<String>>是存放所有的结果，List<String>是一种结果
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<List<String>>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        Set<Integer> columns = new HashSet<Integer>();
        Set<Integer> diagonals1 = new HashSet<Integer>();
        Set<Integer> diagonals2 = new HashSet<Integer>();
        backtrack(solutions, queens, n, 0, columns, diagonals1, diagonals2);
        return solutions;
    }

    /**
     * 自定义方法一：二维数组，代表每一行每一列可放皇后的具体位置，0，可放，1不可放
     *
     * @param solutions  结果：【[.Q.., ...Q, Q..., ..Q.]，[..Q., Q..., ...Q, .Q..]】
     * @param queens     int[] queens形参用于存储每行皇后所在的列号。其中queens[i]表示第i行皇后所在的列号。
     * @param n          n皇后
     * @param row        当前行,从0开始
     * @param columns    用于记录哪些列存储了皇后
     * @param diagonals1 记录哪些斜对角线1存储了皇后
     * @param diagonals2 记录哪些斜对角线2存储了皇后
     */
    public static void backtrack(List<List<String>> solutions, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        // 当行数等于第四行时,直接得到第四行皇后的位置..q.
        if (row == n) {
            List<String> board = generateBoard(queens, n);
            solutions.add(board);
        }
        //
        else {
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) {
                    continue;
                }
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) {
                    continue;
                }
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) {
                    continue;
                }
                queens[row] = i;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                backtrack(solutions, queens, n, row + 1, columns, diagonals1, diagonals2);
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    /**
     * 自定义方法二：一维数组，代表每一行里可放置皇后的位置，q为皇后，.不可放
     *
     * @param queens int[] queens形参用于存储每行皇后所在的列号。其中queens[i]表示第i行皇后所在的列号。
     *               queens[0]表示第1行皇后的位置,即所在的列号
     * @param n      n皇后
     */


    public static List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }




}

