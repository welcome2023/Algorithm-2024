package com.algorithmtest.tree;

import com.algorithmtest.bean.Tree;
import com.algorithmtest.sort.HeapSort;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 22:16
 */
public class SearchTree {
    public static void main(String[] args) {
        Tree head = new Tree(2);
        head.left = new Tree(1);
        head.right = new Tree(3);
        System.out.println(isBST1(head));
//        System.out.println(isBST2(head));
//        System.out.println(isBST3(head));
    }

    public static int preValue = Integer.MIN_VALUE;

    public static boolean isBST1(Tree head) {
        if (head == null) {
            return true;
        }
        boolean isLeftBst = isBST1(head.left);
        if (!isLeftBst) {
            return false;
        }
        if (head.value <= preValue) {
            return false;
        } else {
            preValue = head.value;
        }
        return isBST1(head.right);
    }

    public static boolean isBST2(Tree head) {
        List<Tree> inOrderList = new ArrayList<>();
        process(head, inOrderList);
        int preValue = Integer.MIN_VALUE;
        for (Tree tree : inOrderList) {
            if (preValue >= tree.value) {
                return false;
            }
            preValue= tree.value;
        }
        return true;
    }

    private static void process(Tree head, List<Tree> inOrderList) {
        if (head == null) {
            return;
        }
        process(head.left, inOrderList);
        inOrderList.add(head);
        process(head.right, inOrderList);
    }


    public static boolean isBST3(Tree head) {
        if (head != null) {
            int preValue = Integer.MIN_VALUE;
            Stack<Tree> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    if (head.value <= preValue) {
                        return false;
                    } else {
                        preValue = head.value;
                    }
                    head = head.right;
                }
            }
        }
        return true;
    }
}
