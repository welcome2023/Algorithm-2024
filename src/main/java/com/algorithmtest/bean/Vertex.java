package com.algorithmtest.bean;

import java.util.ArrayList;

/**
 * @author cmsxyz@163.com
 * @date 2024-02-17 14:35
 */
public class Vertex {
    public int value;
    public int in;
    public int out;
    public ArrayList<Vertex> nexts;
    public ArrayList<Edge> edges;
    public Vertex(int value){
        this.value=value;
        this.in=0;
        this.out=0;
        this.nexts=new ArrayList<>();
        this.edges=new ArrayList<>();
    }
}
