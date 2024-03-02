package com.algorithmtest.graph;

import com.algorithmtest.bean.Edge;
import com.algorithmtest.bean.Vertex;
import com.algorithmtest.linklist.IsPalindromeList;
import sun.reflect.generics.scope.DummyScope;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-28 20:02
 * @usage
 */
public class Dijkstra {
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
