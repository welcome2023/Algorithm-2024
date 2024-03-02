package com.algorithmtest.graph;

import com.algorithmtest.bean.Edge;
import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Vertex;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 23:24
 * @usage
 */
public class PrimMST {
    public static Set<Edge> primMST(Graph graph) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
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
