package com.hwreal.day10.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-29 19:50
 * @usage
 * 95723
 * 93527
 */
public class Class04_Tree_SequenceTraversal {
    static String posString;
    static String midString;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        posString=sc.nextLine();
        midString=sc.nextLine();
        Tree99 root = buildTree(0, posString.length() - 1, 0, midString.length() - 1);
        System.out.println(travel(root));
    }

    public static String travel(Tree99 root){
        StringBuilder sb = new StringBuilder();
        Queue<Tree99> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Tree99 node = queue.poll();
            sb.append(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return sb.toString();
    }

    public static Tree99 buildTree(int posLeft, int posRight, int midLeft, int midRight) {
        Tree99 root = new Tree99(posString.charAt(posRight));
        int midRoot = 0;
        for (; midRoot < midString.length(); midRoot++) {
            if (midString.charAt(midRoot) == posString.charAt(posRight)) {
                break;
            }
        }

        int leftCount = midRoot - midLeft;
        int rightCount = midRight - midRoot;

        if (leftCount > 0) {
            root.left=buildTree(posLeft,posLeft+leftCount-1,midLeft,midRoot-1);
        }
        if (rightCount>0) {
            root.right=buildTree(posLeft+leftCount,posRight-1,midRoot+1,midRight);
        }
        return root;
    }

}

class Tree99 {
    char val;
    Tree99 left;
    Tree99 right;

    public Tree99(char val) {
        this.val = val;
    }
}