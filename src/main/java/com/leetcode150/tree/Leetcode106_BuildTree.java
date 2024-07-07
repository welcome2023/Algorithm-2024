package com.leetcode150.tree;


import java.util.HashMap;
import java.util.Map;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode106_BuildTree {
  static   Map<Integer, Integer> map;  // 方便根据数值查找位置

    public static void main(String[] args) {
        int []in={4,2,6,1,7,3,5};
        int []pos={4,6,2,7,5,3,1};
        TreeNode root = buildTree(in, pos);
        dfs(root);
    }
    private static void dfs(TreeNode root) {
        if(root==null){return;}
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) { // 用map保存中序序列的数值对应位置
            map.put(inorder[i], i);
        }

        return findNode(inorder, 0, inorder.length, postorder, 0, postorder.length);  // 前闭后开
    }

    public static TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        // 参数里的范围都是前闭后开
        if (inBegin >= inEnd || postBegin >= postEnd) {  // 不满足左闭右开，说明没有元素，返回空树
            return null;
        }
        int rootIndex = map.get(postorder[postEnd - 1]);  // 找到后序遍历的最后一个元素在中序遍历中的位置
        TreeNode root = new TreeNode(inorder[rootIndex]);  // 构造结点
        int lenOfLeft = rootIndex - inBegin;  // 保存中序左子树个数，用来确定后序数列的个数
        root.left = findNode(inorder, inBegin, rootIndex,
                postorder, postBegin, postBegin + lenOfLeft);
        root.right = findNode(inorder, rootIndex + 1, inEnd,
                postorder, postBegin + lenOfLeft, postEnd - 1);

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
