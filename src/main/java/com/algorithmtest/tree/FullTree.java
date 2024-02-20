package com.algorithmtest.tree;

import com.algorithmtest.bean.Tree;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-20 22:26
 */
public class FullTree {
    public static void main(String[] args) {
        Tree head = new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        head.left.left = new Tree(4);
        head.left.right = new Tree(5);
        head.right.left = new Tree(6);
        head.right.right = new Tree(7);
        System.out.println(isF(head));
    }

    public static boolean isF(Tree head){
        if(head==null){
            return true;
        }
       f data=isFullTree(head);
        return data.nodeNum==((1<<data.height)-1);
    }

    public static  class f{
        public int nodeNum;
        public int height;
        public f(int num,int hei){
            this.nodeNum=num;
            this.height=hei;
        }
    }

    public static f isFullTree(Tree head){
        if(head==null){
            return new f(0,0);
        }
        f leftData=isFullTree(head.left);
        f rightData=isFullTree(head.right);
        int num= leftData.nodeNum+rightData.nodeNum+1;
        int hei=Math.max(leftData.height,rightData.height)+1;
        return new f(num,hei);
    }
}
