package com.algorithmtest.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 14:39
 */
public class Edge {
    public int weight;
    public Vertex from;
    public Vertex to;

    public Edge (int weight,Vertex from,Vertex  to){
        this.weight=weight;
        this.from=from;
        this.to=to;
    }

}
