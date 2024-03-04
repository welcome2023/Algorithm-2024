package com.algorithmtest.graph;

import com.algorithmtest.bean.Edge;
import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Vertex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-28 20:02
 * @usage 适用范围：没有权重为负的边，求一个点到图中每个点距离的最小值
 *
 */
public class Class06_Dijkstra {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex v1 = new Vertex(1, 0, 2);
        Vertex v2 = new Vertex(2, 1, 0);
        Vertex v5 = new Vertex(5, 1, 0);
        v1.nexts.add(v5);
        v1.nexts.add(v2);
        graph.vertexs.put(1, v1);
        graph.vertexs.put(2, v2);
        graph.vertexs.put(5, v5);
        Edge edge1 = new Edge(1, v1, v2);
        Edge edge5 = new Edge(100, v1, v5);
        v1.edges.add(edge1);
        v1.edges.add(edge5);
        graph.edges.add(edge1);
        graph.edges.add(edge5);
        Set<Map.Entry<Vertex, Integer>> entries = dijkstra1(v1).entrySet();
        for (Map.Entry<Vertex, Integer> entry : entries) {
            System.out.println(entry.getKey().value+"--"+ entry.getValue());
        }
    }

    // 从head出发，求到所有点的最短距离
    // key:从head出发到达的点
    // value：从head出发到达key点的最短距离
    // 如果在表中，没有t的记录，含义是从head出发到t这个点的距离为正无穷
    public static HashMap<Vertex, Integer> dijkstra1(Vertex head) {
        HashMap<Vertex, Integer> distanceMap = new HashMap<>();
        distanceMap.put(head, 0);
        HashSet<Vertex> selectedNodes = new HashSet<>();
        Vertex minNode = getMinDistanceAndUnselectedNode(distanceMap, selectedNodes);
        while (minNode != null) {
            int distance = distanceMap.get(minNode);
            for (Edge edge : minNode.edges) {
                Vertex toNode = edge.to;
                if (!distanceMap.containsKey(toNode)) {
                    distanceMap.put(toNode, distance + edge.weight);
                }
                distanceMap.put(edge.to, Math.max(distanceMap.get(toNode), distance + edge.weight));
            }

            selectedNodes.add(minNode);
            minNode = getMinDistanceAndUnselectedNode(distanceMap, selectedNodes);
        }
        return distanceMap;
    }

    private static Vertex getMinDistanceAndUnselectedNode(HashMap<Vertex, Integer> distanceMap, HashSet<Vertex> touchedNodes) {
        Vertex minNode=null;
        int minDistance = Integer.MAX_VALUE;
        for (Map.Entry<Vertex, Integer> entry : distanceMap.entrySet()) {
            Vertex node = entry.getKey();
            Integer distance = entry.getValue();
            if(!touchedNodes.contains(node)&& distance<minDistance){
                minNode=node;
                minDistance=distance;
            }
        }
        return minNode;
    }
}
