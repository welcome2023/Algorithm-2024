package com.leetcode150.linklist;

import com.algorithmdoor.recursion.NiXuDui;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-07-05 10:34
 * @usage
 */
public class Leetcode707_MyLinkedList {
    int size;
    ListNode head;


    public Leetcode707_MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode pre = head;
        for (int i = 0; i <= index; i++) {
            pre = pre.next;
        }
        return pre.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return ;
        }
        size++;
        ListNode pre = head;
        ListNode newNode=new ListNode(val);
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        newNode.next=pre.next;
        pre.next=newNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return ;
        }
        size--;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next=pre.next.next;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
