package com.algorithmdoor.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-01 23:25
 */
public class DoubleNode {
    public int data;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }

    @Override
    public String toString() {
        return "DoublyLinkedListNode{" +
                "val=" + data +
                ", prev=" + (pre != null ? pre.data : "null") +
                ", next=" + (next != null ? next.data : "null") +
                '}';
    }

}
