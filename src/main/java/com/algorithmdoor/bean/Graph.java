package com.algorithmdoor.bean;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 10:07
 */
public class Graph {
    // key:点的编号  value:实际的点
    public HashMap<Integer, Vertex> vertexs;
    public HashSet<Edge> edges;
    public Graph(){
        this.vertexs=new HashMap<>();
        this.edges=new HashSet<>();
    }
}
