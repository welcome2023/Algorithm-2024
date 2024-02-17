package com.algorithmtest.tree;

import com.algorithmtest.bean.Tree;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-06 22:54
 */
public class BinaryTreeRecursionErgodic {

    public static void main(String[] args) {
        Tree head=new Tree(1);
        head.left=new Tree(2);
        head.right=new Tree(3);
        head.left.left=new Tree(4);
        head.left.right=new Tree(5);
        head.right.left=new Tree(6);
        head.right.right=new Tree(7);
        System.out.println("先序遍历");
        preOrderRecur(head);
        System.out.println("中序遍历");
        inOrderRecur(head);
        System.out.println("后序遍历");
        posOrderRecur(head);
    }
    public static void  f(Tree head){
        if(head==null){
            return;
        }
        f(head.left);
        f(head.right);
    }

    public static void preOrderRecur(Tree head){
        if(head==null){
            return;
        }
        System.out.println(head.value+" ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public static void inOrderRecur(Tree head){
        if(head==null){
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value+" ");
        inOrderRecur(head.right);
    }

    public static void posOrderRecur(Tree head){
        if(head==null){
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value+" ");
    }

}
