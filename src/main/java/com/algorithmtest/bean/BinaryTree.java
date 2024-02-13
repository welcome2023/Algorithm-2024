package com.algorithmtest.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-06 22:51
 */
public class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
