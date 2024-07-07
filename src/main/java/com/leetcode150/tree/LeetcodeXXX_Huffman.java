package com.leetcode150.tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class LeetcodeXXX_Huffman {
    static List<TreeNode> list;
    static StringBuilder sb;

    public static void main(String[] args) {
        int[] arr = {5, 15, 40, 30, 10};
        buildHuffman(arr);
        System.out.println(sb.toString());
    }

    public static void buildHuffman(int[] arr) {
        list = new ArrayList<>();
        for (int i : arr) {
            list.add(new TreeNode(i, 1));
        }
        while (list.size() > 1) {
            Collections.sort(list);
            TreeNode first = list.remove(0);
            TreeNode second = list.remove(0);
            int maxHeight = Math.max(first.height, second.height);
            TreeNode tree = new TreeNode(first, second, first.val + second.val, maxHeight + 1);
            list.add(tree);
        }
        sb = new StringBuilder();
        dfs(sb, list.get(0));

    }

    private static void dfs(StringBuilder sb, TreeNode tree) {
        if (tree == null) {
            return;
        }
        dfs(sb, tree.left);
        sb.append(tree.val).append(" ");
        dfs(sb, tree.right);

    }


    public static class TreeNode implements Comparable<TreeNode> {
        int val;
        TreeNode left;
        TreeNode right;
        int height;

        TreeNode() {
        }

        TreeNode(int val, int height) {
            this.val = val;
            this.height = height;
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(TreeNode left, TreeNode right, int val, int height) {
            this.val = val;
            this.height = height;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(TreeNode o) {
            return this.val == o.val ? this.height - o.height : this.val - o.val;
        }
    }
}
