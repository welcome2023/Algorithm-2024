package com.algorithmtest.graph;

import com.algorithmtest.bean.Edge;
import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Vertex;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 21:58
 * @usage
 */
public class SortedTopology {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.edges.add(new Edge(2, new Vertex(1), new Vertex(2)));
        graph.edges.add(new Edge(2, new Vertex(2), new Vertex(3)));
        graph.edges.add(new Edge(2, new Vertex(2), new Vertex(4)));
        graph.edges.add(new Edge(2, new Vertex(1), new Vertex(4)));
        graph.edges.add(new Edge(2, new Vertex(1), new Vertex(3)));
        graph.vertexs.put(1, new Vertex(1));
        graph.vertexs.put(2, new Vertex(2));
        graph.vertexs.put(3, new Vertex(3));
        graph.vertexs.put(4, new Vertex(4));
        for (Vertex vertex : sortedTopology(graph)) {
            System.out.println(vertex.value);
        }
    }

    public static List<Vertex> sortedTopology(Graph graph) {
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
