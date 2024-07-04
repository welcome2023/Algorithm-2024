package com.leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode150_EvalRPN {
    public static void main(String[] args) {
        Leetcode150_EvalRPN obj = new Leetcode150_EvalRPN();
        System.out.println(obj.evalRPN(new String[]{"2","1","+","3","*"}));
    }


    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
            if(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")){
                stack.addFirst(Integer.valueOf(s));
            }else if(s.equals("+")){
                Integer a = stack.pollFirst();
                Integer b = stack.pollFirst();
                stack.addFirst(a+b);
            }    else if(s.equals("-")){
                Integer a = stack.pollFirst();
                Integer b = stack.pollFirst();
                stack.addFirst(b-a);
            }else if(s.equals("*")){
                Integer a = stack.pollFirst();
                Integer b = stack.pollFirst();
                stack.addFirst(a*b);
            }else if(s.equals("/")){
                Integer a = stack.pollFirst();
                Integer b = stack.pollFirst();
                stack.addFirst(b/a);
            }
        }
        return stack.peek();
    }
}
