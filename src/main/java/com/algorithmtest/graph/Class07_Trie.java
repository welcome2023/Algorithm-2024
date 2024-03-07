package com.algorithmtest.graph;

import com.algorithmtest.bean.TrieTree;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 16:39
 * @usage
 */
public class Class07_Trie {
    private TrieTree root;
    public Class07_Trie() {
        this.root=new TrieTree();
    }
    public static void main(String[] args) {
        Class07_Trie node = new Class07_Trie();
        node.insert("a");
        node.insert("aab");
        node.insert("abc");
        int ab = node.prefixNumber("a");
        System.out.println(ab);

    }

    public void insert(String word){
        if(word==null){
            return;
        }
        char[] chs=word.toCharArray();
        TrieTree node=root;
        node.pass++;
        int index=0;
        for (int i = 0; i < chs.length; i++) {
            index=chs[i]-'a';
            if(node.nexts[index]==null){
                node.nexts[index]=new TrieTree();
            }
            node=node.nexts[index];
            node.pass++;
        }
        node.end++;
    }

    public int search(String word){
        if(word==null){
            return 0;
        }
        char[]chs=word.toCharArray();
        TrieTree node=root;
        int index=0;
        for (int i = 0; i < chs.length; i++) {
            index=chs[i]-'a';
            if(node.nexts[index]==null){
                return 0;
            }
            node =node.nexts[index];
        }
        return node.end;
    }

    public int prefixNumber(String pre){
        if(pre==null){
            return 0;
        }
        char[]chs=pre.toCharArray();
        TrieTree node=root;
        int index=0;
        for (int i = 0; i < chs.length; i++) {
            index=chs[i]-'a';
            if(node.nexts[index]==null){
                return 0;
            }
            node =node.nexts[index];
        }
        return node.pass;
    }

    public void delete(String word){
      if(search(word)!=0){
          char[]chs=word.toCharArray();
          TrieTree node=root;
          node.pass--;
          int index=0;
          for (int i = 0; i < chs.length; i++) {
              index=chs[i]-'a';
              if(--node.nexts[index].pass==0){
                  node.nexts[index]=null;
                  return;
              }
              node =node.nexts[index];
          }
          node.end--;
      }
    }


}
