package com.algorithmdoor.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 17:00
 * @usage
 */
public class Class02_LowestLexicography {
    public static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String a, String b) {
            return (a + b).compareTo(b + a);
        }
    }

    public static String lowestString(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs,new MyComparator());
        String res="";
        for (int i = 0; i < strs.length; i++) {
            res+=strs[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String []strs1={"jibw","ji","bw","jibw"};
        System.out.println(lowestString(strs1));
    }
}
