package com;


import com.algorithmtest.bean.*;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import jdk.management.resource.internal.inst.StaticInstrumentation;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;


/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
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
        System.out.println(graph);
    }
    public static void sortTology(Graph graph){
        Map<Vertex, Integer> inMap = new HashMap<>();
        Queue<Vertex> zeroInVertex = new LinkedList<>();
        for (Vertex vertex : graph.vertexs.values()) {
            inMap.put(vertex,vertex.in);
            if(vertex.in==0){
                zeroInVertex.add(vertex);
            }
        }
        while (!zeroInVertex.isEmpty()){
            Vertex cur = zeroInVertex.poll();
            System.out.println(cur.value);
            for (Vertex next : cur.nexts) {
                inMap.put(next,inMap.get(next)-1);
                if(inMap.get(next)==0){
                    zeroInVertex.add(next);
                }
            }

        }
    }
}



