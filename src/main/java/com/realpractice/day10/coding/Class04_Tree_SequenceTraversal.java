package com.realpractice.day10.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-29 19:50
 * @usage
 */
public class Class04_Tree_SequenceTraversal {
    private String postorder;
    private String inorder;
    private class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(char val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String postorderStr = in.next();
        String inorderStr = in.next();
        Class04_Tree_SequenceTraversal mainClass = new Class04_Tree_SequenceTraversal();
        mainClass.postorder = postorderStr;
        mainClass.inorder = inorderStr;
        TreeNode root = mainClass.buildTree(0, postorderStr.length() - 1, 0, inorderStr.length() - 1);
        System.out.println(mainClass.traversal(root));
    }
    private TreeNode buildTree(int postLeft, int postRight, int inLeft, int inRight){
        TreeNode root = new TreeNode(postorder.charAt(postRight));
        int inorderRootIndex = 0;
        for(inorderRootIndex = inLeft; inorderRootIndex <= inRight; inorderRootIndex++){
            if(inorder.charAt(inorderRootIndex) == postorder.charAt(postRight))
                break;
        }
        int leftNodeNum = inorderRootIndex - inLeft;
        int rightNodeNum = inRight - inorderRootIndex;
        if(leftNodeNum > 0)
            root.left = buildTree(postLeft, postLeft + leftNodeNum - 1, inLeft,
                    inorderRootIndex - 1);
        if(rightNodeNum > 0)
            root.right = buildTree(postLeft + leftNodeNum, postRight - 1, inorderRootIndex + 1,
                    inRight);
        return root;
    }
    private String traversal(TreeNode root){
        String ans = "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans = ans + node.val;
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
        return ans;
    }
}
