package com;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            stack.push(arr1[i]);
            for (int j = 0; j <= i; j++) {
                if (stack.peekFirst() == arr2[j]) {
                    stack.pollFirst();
                    sb.append("R");
                }
                if (stack.peekLast() == arr2[j]) {
                    stack.pollLast();
                    sb.append("L");
                }
            }
        }
    }
}
