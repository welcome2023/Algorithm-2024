package com.algorithmdoor.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-25 23:06
 */
public class Node {

    public int value;
    public Node next;
    public Node rand;

    public Node(int data) {
        this.value = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + (next != null ? next.value : "null") +
                '}';
    }
}
