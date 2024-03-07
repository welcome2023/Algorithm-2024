package com;


import com.algorithmtest.bean.*;
import com.algorithmtest.graph.Class07_Trie;
import com.algorithmtest.utils.EdgeComparator;
import com.algorithmtest.utils.ProgramComparator;

import java.util.*;


/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static int process(Program [] pro,int time){
        Arrays.sort(pro,new ProgramComparator());
        int result=0;
        for (int i = 0; i < pro.length; i++) {
            if(pro[i].start>time){
                result++;
                time=pro[i].end;
            }
        }
        return result;
    }


 }



