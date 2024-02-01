package com;

import lombok.ToString;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-31 21:59
 */
public class node {
    public int data;
    public node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "data: "+data+",next: "+next;
    }
}
