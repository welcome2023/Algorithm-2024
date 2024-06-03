package com.Leetcode150.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 12:08
 * @usage
 */
public class Class02_Leetcode077_Combine {
    static List<List<Integer>> res=new ArrayList<>();

    public static void main(String[] args) {
        for (List<Integer> ins : combine(1, 1)) {
            for (Integer i : ins) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        backtrack(n,0,k,new ArrayList<Integer>());
        return res;
    }

        private static void backtrack(int n, int i, int k, ArrayList<Integer> list) {
            if(list.size()==k){
                res.add(new ArrayList<>(list));
                return;
            }
            for (int j = i; j < n; j++) {
                list.add(j+1);
                backtrack(n,j+1,k,list);
                list.remove(list.size()-1);
            }
        }
}
