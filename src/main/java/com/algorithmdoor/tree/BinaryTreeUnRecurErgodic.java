package com.algorithmdoor.tree;

import com.algorithmdoor.bean.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-12 22:27
 */
public class BinaryTreeUnRecurErgodic {
    public static void main(String[] args) {
        Tree head = new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        head.left.left = new Tree(4);
        head.left.right = new Tree(5);
        head.right.left = new Tree(6);
        head.right.right = new Tree(7);
        width(head);
    }

    public static void preOrderUnRecur(Tree head) {
        System.out.println("pre-order");
        if (head != null) {
            Stack<Tree> stack = new Stack<>();
            stack.add(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.value + " ");
                if (head.right != null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }


    public static void inOrderUnRecur(Tree head) {
        System.out.println("in-order ");
        if (head != null) {
            Stack<Tree> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.println(head.value + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    public static void posOrderUnRecur(Tree head) {
        System.out.println("pos-order");
        if (head != null) {
            Stack<Tree> stack1 = new Stack<>();
            Stack<Tree> stack2 = new Stack<>();
            stack1.push(head);
            while (!stack1.isEmpty()) {
                head = stack1.pop();
                stack2.push(head);
                if (head.left != null) {
                    stack1.push(head.left);
                }
                if (head.right != null) {
                    stack1.push(head.right);
                }
            }
            while (!stack2.isEmpty()) {
                System.out.println(stack2.pop().value + " ");
            }
            System.out.println();
        }
    }


    public static void width(Tree head) {
        if (head == null) {
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            Tree cur = queue.poll();
            System.out.println(cur.value);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

    }
}
