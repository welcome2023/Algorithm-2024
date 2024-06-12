package com.Leetcode150.stack;

import java.util.Stack;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-05 22:48
 * @usage
 */
public class Class01_Leetcode020_Parenthesis {
    public static void main(String[] args) {
        System.out.println(isSymmetric("{}(){}"));
    }
    public static boolean isSymmetric(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '['||c=='{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
            else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
