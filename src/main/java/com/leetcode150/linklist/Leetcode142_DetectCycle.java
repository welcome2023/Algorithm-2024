package com.leetcode150.linklist;

import javax.swing.text.AbstractDocument;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode142_DetectCycle {
    public static void main(String[] args) {
        Leetcode142_DetectCycle obj = new Leetcode142_DetectCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        System.out.println(obj.detectCycle(head).val);
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
          fast=fast.next.next;
          slow=slow.next;
          if(fast==slow){
              ListNode index1=slow;
              ListNode index2=head;
              while (index2!=index1){
                  index2=index2.next;
                  index1=index1.next;
              }
              return index2;
          }
        }
        return null;
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