package com.leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode071_SimplifyPath {
    public static void main(String[] args) {
        Leetcode071_SimplifyPath obj = new Leetcode071_SimplifyPath();
        System.out.println(obj.simplifyPath("/.../a/../b/c/../d/./"));
    }


    public String simplifyPath(String path) {
        Deque<String> stack1 = new ArrayDeque<>();
        Deque<String> stack2 = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        String[] arr = path.split("/+");
        //按照//切分,并且去掉首个空格


        for (int i = 1; i < arr.length; i++) {
            if (Character.isLetter(arr[i].charAt(0))) {
                stack1.addFirst(arr[i]);
            } else if (arr[i].equals("..")) {
                if (!stack1.isEmpty()) {
                    stack1.pollFirst();
                }
            } else if (!arr[i].equals(".")) {
                stack1.addFirst(arr[i]);
            }
        }

        if (stack1.isEmpty()) {
            return "/";
        } else {
            while (!stack1.isEmpty()) {
                stack2.addFirst("/");
                stack2.addFirst(stack1.pollLast());
            }

            while (!stack2.isEmpty()) {
                sb.append(stack2.pollLast());
            }
            return sb.toString();
        }
    }
}
