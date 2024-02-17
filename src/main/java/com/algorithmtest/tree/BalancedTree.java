package com.algorithmtest.tree;

import com.algorithmtest.bean.Tree;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 22:04
 */
public class BalancedTree {

    public static boolean isBalanced(Tree head){
        return process(head).isBalanced;
    }

    public static class ReturnType{
        public boolean isBalanced;
        public int height;
        public ReturnType(boolean isB,int hei){
            this.isBalanced=isB;
            this.height=hei;
        }
    }

    public static ReturnType process(Tree x){
        if(x==null){
            return new ReturnType(true,0);
        }
        ReturnType leftData=process(x.left);
        ReturnType rightData=process(x.right);

        int height= Math.max(leftData.height, rightData.height)+1;
        boolean isBalanced= leftData.isBalanced&&rightData.isBalanced&&Math.abs(leftData.height-rightData.height)<2;
        return new ReturnType(isBalanced,height);
    }
}
