package com.leetcode150.linklist;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class LeetcodeXXX_GetIntersectionNode {
    public static void main(String[] args) {


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA=headA;
        while (curA != null) {
            ListNode curB = headB;
            while (curB != null) {
                if (curA == curB) {
                    return curA;
                }
                curB = curB.next;
            }
            curA = curA.next;
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