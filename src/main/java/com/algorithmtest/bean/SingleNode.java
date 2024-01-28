package com.algorithmtest.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-28 23:12
 */
public class SingleNode {
    public int value;
    public SingleNode next;

    public SingleNode(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "value:" + value + ",next:" + (next != null ? next.value : null);
    }
}
