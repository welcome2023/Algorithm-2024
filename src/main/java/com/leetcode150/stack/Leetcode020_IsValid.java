package com.leetcode150.stack;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode020_IsValid {
    public static void main(String[] args) {
        Leetcode020_IsValid obj = new Leetcode020_IsValid();
        System.out.println(obj.isValid("{(]}"));

    }


    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.addFirst(s.charAt(i));
            } else if (s.charAt(i)==')') {
                if(!stack.isEmpty()&&stack.pollFirst()!='('){
                    return false;
                }
            } else if (s.charAt(i)=='}') {
                if(!stack.isEmpty()&&stack.pollFirst()!='{'){
                    return false;
                }
            } else if (s.charAt(i)==']') {
                if(!stack.isEmpty()&&stack.pollFirst()!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
