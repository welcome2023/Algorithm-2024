package com.algorithmtest.graph;

import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Vertex;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-25 17:28
 */
public class BFS {
    public static void main(String[] args) {
        Vertex root = new Vertex(1);
        Vertex child1 = new Vertex(3);
        Vertex grandchild1 = new Vertex(2);
        Vertex child2 = new Vertex(4);
        Vertex child3 = new Vertex(5);
        Vertex child4 = new Vertex(6);
        root.nexts.add(child1);
        root.nexts.add(child3);
        child1.nexts.add(grandchild1);
        child3.nexts.add(child4);
        root.nexts.add(child2);
        grandchild1.nexts.add(root);
        bfs(root);
    }

    public static void bfs(Vertex node) {
        if (node == null) {
            return;
        }
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> set = new HashSet<>();
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty()) {
            Vertex cur = queue.poll();
            System.out.println(cur.value);
            for (Vertex next : cur.nexts) {
                if (!set.contains(next)) {
                    set.add(next);
                    queue.add(next);
                }
            }
        }
    }
}
