package com.algorithmtest.tree;

import com.algorithmtest.bean.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 22:16
 */
public class SearchTree {
    public static int preValue = Integer.MIN_VALUE;

    public static boolean isBST(Tree head) {
        if (head == null) {
            return true;
        }
        boolean isLeftBst = isBST(head.left);
        if (!isLeftBst) {
            return false;
        }
        if (head.value <= preValue) {
            return false;
        } else {
            preValue = head.value;
        }
        return isBST(head.right);
    }

//    public static boolean checkBST(Tree head){
//       List<Tree> inOrderList = new ArrayList<>();
//       
//    }
}
