package com.leetcode150.linklist;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode203_RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
       ListNode cur=new ListNode(-1);
       cur.next=head;
       ListNode temp=cur;
       while (temp.next!=null){
           if(temp.next.val==val){
               temp.next=temp.next.next;
           }else {
               temp=temp.next;
           }
       }
       return cur.next;
    }
    static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

}