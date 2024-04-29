package com.realpractice.day7.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-25 21:58
 * @usage
 */
public class Class04_Tree_Tree3Height {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = in.nextInt();
        }
        Node root = new Node();
        root.value = nums[0];
        for (int i = 1; i < count; i++) {
            insert(root, nums[i]);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.middle != null) {
                    queue.add(node.middle);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            height++;
        }
        System.out.println(height);
    }
    public static void insert(Node node, int value) {
        if (node.value - value > 500) {
            if (node.left == null) {
                node.left = new Node();
                node.left.value = value;
            } else {
                insert(node.left, value);
            }
        } else if (node.value - value < -500) {
            if (node.right == null) {
                node.right = new Node();
                node.right.value = value;
            } else {
                insert(node.right, value);
            }
        } else {
            if (node.middle == null) {
                node.middle = new Node();
                node.middle.value = value;
            } else {
                insert(node.middle, value);
            }
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;
    Node middle;
}

