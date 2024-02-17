package com.algorithmtest.bean;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 10:07
 */
public class Graph {
    public HashMap<Integer, Vertex> vertexs;
    public HashSet<Edge> edges;
    public Graph(){
        this.vertexs=new HashMap<>();
        this.edges=new HashSet<>();
    }
}
