package com.leetcode150.linklist;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode024_SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dump=new ListNode(-1);
        dump.next=head;
        ListNode cur=dump;
        while (cur.next!=null&&cur.next.next!=null){
            ListNode temp1=cur.next;
            ListNode temp2=cur.next.next.next;
            cur.next=cur.next.next;
            cur.next.next=temp1;
            temp1.next=temp2;
            cur=cur.next.next;
        }
        return dump.next;
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