package com.algorithmtest.linklist;

import com.algorithmtest.bean.DoubleNode;
import com.algorithmtest.bean.SingleNode;

import java.util.function.Predicate;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-01 23:42
 */
public class ReverseDList {
    public static void main(String[] args) {
        DoubleNode head = new DoubleNode(1);
        head.next = new DoubleNode(4);
        head.next.pre = head;
        head.next.next = new DoubleNode(5);
        head.next.next.pre = head.next;
        printLinkedList(head);


        DoubleNode pre = reverse(head);
        printLinkedList(pre);


    }


    public static DoubleNode reverse(DoubleNode head) {
        DoubleNode cur = head;
        DoubleNode pre = null;
        while (cur != null) {
            DoubleNode tmp = cur.next;
            cur.next = pre;
            cur.pre = tmp;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }



    public static void printLinkedList(DoubleNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node).append(" -> ");
            node = node.next;
        }
        sb.append("null");
        System.out.println(sb);
    }



}
