package com.algorithmdoor.bean;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 16:37
 * @usage
 */
public class TrieTree {
    public int pass;
    public int end;
    public TrieTree[] nexts;
    public TrieTree(){
        this.pass=0;
        this.end=0;
        this.nexts=new TrieTree[26];
    }
}
