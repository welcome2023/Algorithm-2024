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
//        posOrder(head);
        width(head);

    }
    public static void posOrder(Tree head) {
        if (head == null) {
            return;
        }
        Stack<Tree> s1 = new Stack<>();
        Stack<Tree> s2 = new Stack<>();
        s1.push(head);
        while (!s1.isEmpty()){
            head = s1.pop();
            s2.push(head);
            if(head.left!=null){
                s1.push(head.left);
            }
            if(head.right!=null){
                s1.push(head.right);
            }
        }

        while (!s2.isEmpty()){
            System.out.println(s2.pop().value);
        }
    }

    public static void width(Tree head){
        if(head==null){
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
             head = queue.poll();
            System.out.println(head.value);
            if(head.left!=null){
                queue.add(head.left);
            }
            if(head.right!=null){
                queue.add(head.right);
            }
        }
    }
}

