package com.algorithmtest.graph;

import com.algorithmtest.bean.Edge;
import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Vertex;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 21:58
 * @usage 有向无环图的拓扑排序，必定有入度为0的点
 */
public class Class03_SortedTopology {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex v1 = new Vertex(1, 0, 2);
        Vertex v2 = new Vertex(2, 1, 2);
        Vertex v5 = new Vertex(5, 2, 1);
        Vertex v6 = new Vertex(6, 2, 0);
        Vertex v7 = new Vertex(7, 1, 1);
        v1.nexts.add(v5);
        v1.nexts.add(v2);
        v2.nexts.add(v5);
        v2.nexts.add(v6);
        v5.nexts.add(v7);
        v7.nexts.add(v6);
        graph.vertexs.put(1, v1);
        graph.vertexs.put(2, v2);
        graph.vertexs.put(5, v5);
        graph.vertexs.put(6, v6);
        graph.vertexs.put(7, v7);
        graph.edges.add(new Edge(2, v1, v2));
        graph.edges.add(new Edge(5, v1, v5));
        graph.edges.add(new Edge(3, v2, v5));
        graph.edges.add(new Edge(7, v2, v6));
        graph.edges.add(new Edge(6, v5, v7));
        graph.edges.add(new Edge(9, v7, v6));
        List<Vertex> ver = sortedTopology(graph);
        for (Vertex vertex : ver) {
            System.out.println(vertex.value);
        }
    }

    public static List<Vertex> sortedTopology(Graph graph) {
        // k:点  v:入度值
        HashMap<Vertex, Integer> inMap = new HashMap<>();
        Queue<Vertex> zeroInQueue = new LinkedList<>();
        for (Vertex node : graph.vertexs.values()) {
            inMap.put(node, node.in);
            if (node.in == 0) {
                zeroInQueue.add(node);
            }
        }
        List<Vertex> result = new ArrayList<>();
        while (!zeroInQueue.isEmpty()) {
            Vertex cur = zeroInQueue.poll();
            result.add(cur);
            for (Vertex next : cur.nexts) {
                inMap.put(next, inMap.get(next) - 1);
                if (inMap.get(next) == 0) {
                    zeroInQueue.add(next);
                }
            }
        }
        return result;
    }
}
