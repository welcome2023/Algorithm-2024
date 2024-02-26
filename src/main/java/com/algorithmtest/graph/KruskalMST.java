package com.algorithmtest.graph;

import com.algorithmtest.bean.Edge;
import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Vertex;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 22:57
 * @usage
 */
public class KruskalMST {
//    public static Set<Edge> kruskalMST(Graph graph) {
//        UnionFind unionFind = new UnionFind();
//        unionFind.makeSets(graph.vertexs.values());
//        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
//        for (Edge edge : graph.edges) {
//            priorityQueue.add(edge);
//        }
//        Set<Edge> result = new HashSet<>();
//        while (!priorityQueue.isEmpty()) {
//            Edge edge = priorityQueue.poll();
//            if (!unionFind.isSameSet(edge.from, edge.to)) {
//                result.add(edge);
//                unionFind.union(edge.from, edge.to);
//            }
//        }
//        return result;
//    }

    public static class MySets {
        public HashMap<Vertex, List<Vertex>> setMap;

        public MySets(List<Vertex> nodes) {
            for (Vertex cur : nodes) {
                List<Vertex> set = new ArrayList<>();
                set.add(cur);
                setMap.put(cur, set);
            }
        }

        public boolean isSameSet(Vertex from, Vertex to) {
            List<Vertex> fromSet = setMap.get(from);
            List<Vertex> toSet = setMap.get(to);
            return fromSet == toSet;

        }

        public void union(Vertex from, Vertex to) {
            List<Vertex> fromSet = setMap.get(from);
            List<Vertex> toSet = setMap.get(to);
            for (Vertex toVertex : toSet) {
                fromSet.add(toVertex);
                setMap.put(toVertex, fromSet);
            }
        }
    }



}



