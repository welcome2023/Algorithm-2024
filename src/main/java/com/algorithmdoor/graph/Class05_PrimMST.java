package com.algorithmdoor.graph;

import com.algorithmdoor.bean.Edge;
import com.algorithmdoor.bean.Graph;
import com.algorithmdoor.bean.Vertex;
import com.algorithmdoor.utils.EdgeComparator;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 23:24
 * @usage 适用于无向图，随便从一个点开始，将点的所有边放入队列中，
 * 在从队列中选出最小边的to点一次循环进行，
 *
 */
public class Class05_PrimMST {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex v1 = new Vertex(1, 2, 2);
        Vertex v2 = new Vertex(2, 2, 2);
        Vertex v5 = new Vertex(5, 2, 2);

        v1.nexts.add(v5);
        v1.nexts.add(v2);
        v2.nexts.add(v5);
        v2.nexts.add(v1);
        v5.nexts.add(v1);
        v5.nexts.add(v2);

        graph.vertexs.put(1, v1);
        graph.vertexs.put(2, v2);
        graph.vertexs.put(5, v5);

        Edge edge1 = new Edge(1, v1, v2);
        Edge edge11 = new Edge(1, v2, v1);
        Edge edge2 = new Edge(10, v5, v2);
        Edge edge21 = new Edge(10, v2, v5);
        Edge edge5 = new Edge(100, v1, v5);
        Edge edge51 = new Edge(100, v5, v1);

        v1.edges.add(edge1);
        v1.edges.add(edge11);
        v1.edges.add(edge5);
        v1.edges.add(edge51);

        v2.edges.add(edge1);
        v2.edges.add(edge11);
        v2.edges.add(edge2);
        v2.edges.add(edge21);

        v5.edges.add(edge21);
        v5.edges.add(edge2);
        v5.edges.add(edge5);
        v5.edges.add(edge51);

        graph.edges.add(edge1);
        graph.edges.add(edge11);
        graph.edges.add(edge2);
        graph.edges.add(edge21);
        graph.edges.add(edge5);
        graph.edges.add(edge51);

        for (Edge edge : primMST(graph)) {
            System.out.println(edge.weight);
        }
    }

    /**
     * 1.考察过的点放入set
     * 2.解锁的边放入小根堆
     * 3.边结果放入result中
     */

    public static Set<Edge> primMST(Graph graph) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeComparator());
        Set<Vertex> set = new HashSet<>();
        HashSet<Edge> result = new HashSet<>();
        for (Vertex node : graph.vertexs.values()) {
            if (!set.contains(node)) {
                set.add(node);
                for (Edge edge : node.edges) {
                    priorityQueue.add(edge);
                }
            }
            while (!priorityQueue.isEmpty()) {
                // 弹出权重最小的边
                Edge edge = priorityQueue.poll();
                Vertex toNode = edge.to;
                if (!set.contains(toNode)) {
                    set.add(toNode);
                    result.add(edge);
                    for (Edge nextEdge : toNode.edges) {
                        priorityQueue.add(nextEdge);
                    }
                }
            }
        }
        return result;
    }

}
