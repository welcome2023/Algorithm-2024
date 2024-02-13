package com.algorithmtest.linklist;

import com.algorithmtest.bean.SingleNode;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-13 14:37
 */
public class PrintPublicList {
    public static void main(String[] args) {
        SingleNode head1 = new SingleNode(2);
        head1.next=new SingleNode(3);
        head1.next.next=new SingleNode(8);

        SingleNode head2 = new SingleNode(0);
        head2.next=new SingleNode(5);
        head2.next.next=new SingleNode(8);

        printPublicList(head1,head2);

    }

    public static void printPublicList(SingleNode head1, SingleNode head2) {
        if (head1 == null || head2 == null) {
            return;
        }
        while (head1 != null && head2 != null) {
            if (head1.value == head2.value) {
                System.out.println(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.value < head2.value) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }

    }
}
