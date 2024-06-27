package com.hwreal.day1.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 21:30
 * @usage 8
 * 123 124 125 121 119 122 126 123
 */
public class Class02_Stack_FindFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] height = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        stack.add(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                res[stack.pop()] = i;
            }
            stack.add(i);
        }
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
