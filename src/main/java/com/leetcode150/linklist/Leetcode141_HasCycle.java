package com.leetcode150.linklist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode141_HasCycle {
    public static void main(String[] args) {
        Leetcode141_HasCycle obj = new Leetcode141_HasCycle();

    }

    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);
        while (head!=null){
            ListNode next = head.next;
            if(list.contains(next)){
                return true;
            }
            list.add(next);
            head=next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}