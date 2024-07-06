package com.leetcode150.linklist;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode146_LRUCache {
    int capacity;
    ListNode head;


    public Leetcode146_LRUCache(int capacity) {
        this.capacity=capacity;
        head=new ListNode(capacity);
    }

    public int get(int key) {

    }

    public void put(int key, int value) {
        
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