package com.realpractice.day1.coding;

import java.util.Stack;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 21:30
 * @usage
 */
public class Class02_Stack_FindFriend {
    public static void main(String[] args) {
        int []arr={1,5,2,4,3};
        for (int re : getRes(arr)) {
            System.out.print(re+" ");
        }
    }
    public static int[] getRes(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()&&arr[i] > arr[stack.peek()]) {
                res[stack.pop()] = i;
            }
            stack.add(i);
        }
        return res;

    }
}
