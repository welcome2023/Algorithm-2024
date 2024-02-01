package com;


/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {

    public static void main(String[] args) {
        node head= new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        System.out.println(head);


        node cur=head;
        node pre=null;
        while (cur!=null){
            node nextN=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nextN;
        }
        System.out.println(pre);
    }
}

