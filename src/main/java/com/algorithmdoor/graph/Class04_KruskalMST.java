package com.algorithmdoor.graph;

import com.algorithmdoor.bean.Edge;
import com.algorithmdoor.bean.Graph;
import com.algorithmdoor.bean.Vertex;
import com.algorithmdoor.utils.EdgeComparator;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-26 22:57
 * @usage 适用于无向图, 以边作为切入点，权重从小往大排，加入之后判断有没有形成环
 */
public class Class04_KruskalMST {
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

        for (Edge edge : kruskalMST(graph)) {
            System.out.println(edge.weight);
        }



    }

    public static Set<Edge> kruskalMST(Graph graph) {
        UnionFind unionFind = new UnionFind();
        unionFind.makeSets(graph.vertexs.values());
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeComparator());
        for (Edge edge : graph.edges) {
            priorityQueue.add(edge);
        }
        Set<Edge> result = new HashSet<>();
        while (!priorityQueue.isEmpty()) {
            Edge edge = priorityQueue.poll();
            if (!unionFind.isSameSet(edge.from, edge.to)) {
                result.add(edge);
                unionFind.union(edge.from, edge.to);
            }
        }
        return result;
    }

    // 简化版并查集

   public static class UnionFind {
        private HashMap<Vertex, Vertex> fatherMap;
        private HashMap<Vertex, Integer> sizeMap;

        public UnionFind() {
            fatherMap = new HashMap<Vertex, Vertex>();
            sizeMap = new HashMap<Vertex, Integer>();

        }

        public void makeSets(Collection<Vertex> nodes) {
            fatherMap.clear();
            sizeMap.clear();
            for (Vertex node : nodes) {
                fatherMap.put(node, node);
                sizeMap.put(node, 1);

            }
        }


        private Vertex findFather(Vertex n) {
            Stack<Vertex> path = new Stack<>();
            while (n != fatherMap.get(n)) {
                path.add(n);
                n = fatherMap.get(n);

            }
            while (!path.isEmpty()) {
                fatherMap.put(path.pop(), n);
            }
            return n;
        }

        public boolean isSameSet(Vertex a, Vertex b) {
            return findFather(a) == findFather(b);
        }

        public void union(Vertex a, Vertex b) {
            if (a == null || b == null) {
                return;
            }
            Vertex aDai = findFather(a);
            Vertex bDai = findFather(b);
            if (aDai != bDai) {
                int aSetSize = sizeMap.get(aDai);
                int bSetSize = sizeMap.get(bDai);
                if (aSetSize <= bSetSize) {
                    fatherMap.put(aDai, bDai);
                    sizeMap.put(bDai, aSetSize + bSetSize);
                    sizeMap.remove(aDai);
                } else {
                    fatherMap.put(bDai, aDai);
                    sizeMap.put(aDai, aSetSize + bSetSize);
                    sizeMap.remove(bDai);
                }

            }
        }


    }


    // 标准版并查集



}





