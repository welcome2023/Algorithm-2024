package com;


import com.algorithmtest.bean.Graph;
import com.algorithmtest.bean.Node;
import com.algorithmtest.bean.Tree;
import com.algorithmtest.bean.Vertex;
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
        Vertex root = new Vertex(1);
        Vertex child1 = new Vertex(3);
        Vertex child2 = new Vertex(4);
        Vertex child3 = new Vertex(5);
        Vertex child4 = new Vertex(6);
        Vertex child5 = new Vertex(2);
        root.nexts.add(child1);
        root.nexts.add(child3);
        child1.nexts.add(child5);
        child2.nexts.add(child4);
        root.nexts.add(child2);
        child5.nexts.add(root);
        isbst(root);
    }
    public static void isbst(Vertex node){
        if(node==null){
            return;
        }
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> set = new HashSet<>();
        stack.add(node);
        set.add(node);
        System.out.println(node.value);
        while (!stack.isEmpty()){
            Vertex cur = stack.pop();
            for (Vertex next : cur.nexts) {
                if(!set.contains(next)){
                    stack.add(cur);
                    stack.add(next);
                    set.add(next);
                    System.out.println(next.value);
                    break;
                }
            }
        }
    }
}

