package com.algorithmdoor.linklist;


import com.algorithmdoor.bean.SingleNode;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-28 22:53
 */
public class ReverseSList {
    public static void main(String[] args) {
        SingleNode head = new SingleNode(4);
        head.next=new SingleNode(3);
        head.next.next=new SingleNode(2);
        head.next.next.next=new SingleNode(5);
        printLinkedList(head);
         head = reverseList(head);
         printLinkedList(head);
    }
    public static SingleNode reverseList(SingleNode head){
        SingleNode prev=null;
        SingleNode curr= head;
        while (curr!=null){
            SingleNode nextTem=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTem;
        }
        return prev;
    }

    public static void printLinkedList(SingleNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node).append(" -> ");
            node = node.next;
        }
        sb.append("null");
        System.out.println(sb);
    }
}
