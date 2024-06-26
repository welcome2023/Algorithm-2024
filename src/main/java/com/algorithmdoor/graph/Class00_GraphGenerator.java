package com.algorithmdoor.graph;

import com.algorithmdoor.bean.Edge;
import com.algorithmdoor.bean.Graph;
import com.algorithmdoor.bean.Vertex;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 14:44
 * @usage 通过邻接矩阵构建图
 */
public class Class00_GraphGenerator {
    public static Graph createGraph(Integer[][]matrix){
        Graph graph = new Graph();
        for (int i = 0; i < matrix.length; i++) {
            Integer from=matrix[i][0];
            Integer to=matrix[i][1];
            Integer weight=matrix[i][2];
            if(!graph.vertexs.containsKey(from)){
                graph.vertexs.put(from,new Vertex(from));
            }
            if(!graph.vertexs.containsKey(to)){
                graph.vertexs.put(to,new Vertex(to));
            }
            Vertex fromNode = graph.vertexs.get(from);
            Vertex toNode = graph.vertexs.get(to);
            Edge newEdge = new Edge(weight, fromNode, toNode);
            fromNode.nexts.add(toNode);
            fromNode.out++;
            toNode.in++;
            fromNode.edges.add(newEdge);
            graph.edges.add(newEdge);
        }
        return graph;
    }
}
