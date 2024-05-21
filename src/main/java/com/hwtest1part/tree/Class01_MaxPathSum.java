package com.hwtest1part.tree;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-27 22:13
 * @usage
 * 找结果和递归的不同
 * 递推公式:sum=自己+左+右
 * 递归返回结果:output=自己+max(左,右)
 * 递归过程中,找到maxSum=max(maxSum,sum)
 */
public class Class01_MaxPathSum {
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode node = new TreeNode(-10);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.left.left = new TreeNode();
        node.left.right = new TreeNode();
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(maxPathSum(node));
    }
    public static int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
    public static int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);
        int priceNewpath = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, priceNewpath);
        return node.val + Math.max(leftGain, rightGain);


    }

    static class TreeNode {
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

