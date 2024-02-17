package com;


import com.algorithmtest.bean.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {

    public static void main(String[] args) {
        Tree head = new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        head.left.left = new Tree(4);
        head.left.right = new Tree(5);
        head.right.left = new Tree(6);
        head.right.right = new Tree(7);
        inOrder(head);
    }

    public static void inOrder(Tree head) {
        if (head == null) {
            return;
        }
        Stack<Tree> stack = new Stack<>();
        stack.add(head);
        while (!stack.isEmpty()) {
            if (head.left != null) {
                head=head.left;
                stack.push(head);
                System.out.println(head.value);

            }
            if (head.right != null) {
                stack.add(head.right);
            }
        }

    }


}

