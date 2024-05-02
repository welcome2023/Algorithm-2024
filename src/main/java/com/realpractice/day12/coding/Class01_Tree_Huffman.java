package com.realpractice.day12.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-30 16:55
 * @usage
 */
public class Class01_Tree_Huffman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        String[] strings = "5 15 40 30 10".split(" ");
        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        List<Tree> treeList = new ArrayList<>();


        for (int anInt : ints) {
            Tree tree = new Tree(anInt, 1);
            treeList.add(tree);
        }
        while (treeList.size() > 1) {
            //根据 val 进行排序，每次循环进行排序可以保证左树轻于右树
            Collections.sort(treeList);
            Tree first = treeList.remove(0);
            Tree second = treeList.remove(0);
            int maxHeight = Math.max(first.height, second.height);
            Tree tree = new Tree(first, second, first.val + second.val, maxHeight + 1);
            treeList.add(tree);
        }
        StringBuilder stringBuilder = new StringBuilder();
        dfs(stringBuilder, treeList.get(0));
        System.out.println(stringBuilder);
    }



    public static void dfs(StringBuilder res, Tree root) {
        if (root == null) {
            return;
        }
        //按照 左-打印-右的方式遍历
        dfs(res, root.left);
        res.append(root.val + " ");
        dfs(res, root.right);
    }

    static class Tree implements Comparable<Tree> {
        private Tree left;
        private Tree right;
        private int val;
        private int height;

        public Tree(int val, int height) {
            this.val = val;
            this.height = height;
        }

        public Tree(Tree left, Tree right, int val, int height) {
            this.left = left;
            this.right = right;
            this.val = val;
            this.height = height;
        }

        @Override
        public int compareTo(Tree tree) {

            if (tree.val == this.val) {
                return this.height - tree.height;
            }

            return this.val - tree.val;
        }
    }
}