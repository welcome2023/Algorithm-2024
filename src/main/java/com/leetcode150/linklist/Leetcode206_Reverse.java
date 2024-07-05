package com.leetcode150.linklist;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode206_Reverse {
    public ListNode reverseList(ListNode head) {

        ListNode cur=head;
        ListNode pre=null;
        while (cur!=null){
           ListNode temp=cur.next;
           cur.next=pre;
           pre=cur;
           cur=temp;
        }
        return pre;
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