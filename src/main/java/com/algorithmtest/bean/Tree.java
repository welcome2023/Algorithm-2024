package com.algorithmtest.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-06 22:51
 */
public class Tree {
    public int value;
    public Tree left;
    public Tree right;

    public Tree(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
