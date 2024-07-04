package com.leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode155_MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;


    public Leetcode155_MinStack() {
        xStack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        xStack.addFirst(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        xStack.pollFirst();
        minStack.pollFirst();
    }

    public int top() {
        return xStack.peekFirst();
    }

    public int getMin() {
        return minStack.peekFirst();

    }
}
