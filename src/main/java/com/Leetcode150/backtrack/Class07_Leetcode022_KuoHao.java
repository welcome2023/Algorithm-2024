package com.Leetcode150.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 15:08
 * @usage
 */
public class Class07_Leetcode022_KuoHao {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        for (String s : generateParenthesis(2)) {
            System.out.print(s + " ");
        }
    }

    public static List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return list;
    }

    public static void dfs(int leftCount, int rightCount, String res) {
        // 右括号用的比左括号多，剪枝
        if (rightCount < leftCount) return;
        // 终止条件
        if (leftCount == 0 && rightCount == 0) {
            list.add(res);
            return;
        }
        if (leftCount != 0) {
            dfs(leftCount - 1, rightCount, res + "(");
        }
        if (rightCount != 0) {
            dfs(leftCount, rightCount - 1, res + ")");
        }
    }

}
