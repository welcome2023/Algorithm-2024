package com.leetcode150.backtrack;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 15:34
 * @usage
 */
public class Class08_Leetcode079_Exist {
    public static void main(String[] args) {
        char[][]arr={{'a','b','c'},{'m','n','q'},{'x','y','z'}};
        Class08_Leetcode079_Exist obj = new Class08_Leetcode079_Exist();
        System.out.println(obj.exist(arr, "bcq"));
    }
    public  boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    public  boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if (k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

}
