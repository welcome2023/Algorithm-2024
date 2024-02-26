package com.algorithmtest.graph;

import com.algorithmtest.bean.Vertex;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 20:55
 * @usage 图的前序遍历
 */
public class DFS {
    public static void main(String[] args) {
        Vertex root = new Vertex(1);
        Vertex child1 = new Vertex(3);
        Vertex child2 = new Vertex(4);
        Vertex child3 = new Vertex(5);
        Vertex child4 = new Vertex(6);
        Vertex child5 = new Vertex(2);
        root.nexts.add(child1);
        root.nexts.add(child3);
        child1.nexts.add(child5);
        child2.nexts.add(child4);
        root.nexts.add(child2);
        child5.nexts.add(root);
        dfs(root);
    }
    public static void dfs(Vertex node){
        if(node==null){
            return;
        }
        Stack<Vertex> stack = new Stack<>();
        HashSet<Vertex> set = new HashSet<>();
        stack.add(node);
        set.add(node);
        System.out.println(node.value);

        while (!stack.isEmpty()){
            Vertex cur = stack.pop();
            for (Vertex next : cur.nexts) {
                if(!set.contains(next)){
                    stack.push(cur);
                    stack.push(next);
                    set.add(next);
                    System.out.println(next.value);
                    break;
                }
            }
        }
    }
}
