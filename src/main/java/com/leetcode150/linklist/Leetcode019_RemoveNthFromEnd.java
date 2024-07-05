package com.leetcode150.linklist;

import java.util.List;
import java.util.zip.CheckedOutputStream;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode019_RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        Leetcode019_RemoveNthFromEnd obj = new Leetcode019_RemoveNthFromEnd();
        ListNode listNode = obj.removeNthFromEnd(head, 2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode testNode = head;
        int count = 0;
        while (testNode != null) {
            count++;
            testNode = testNode.next;
        }
        System.out.println(count);
        ListNode dump = new ListNode(-1);
        dump.next=head;
        ListNode cur = dump;
        for (int i = 0; i < count - n; i++) {
            cur = cur.next;
        }
        cur.next=cur.next.next;
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