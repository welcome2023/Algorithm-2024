package com.Leetcode150.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 12:37
 * @usage
 */
public class Class03_Leetcode046_Permute {
    static  List<List<Integer>> res=new ArrayList<>();

    public static void main(String[] args) {
        int []arr={1,2,3};
        for (List<Integer> li : permute(arr)) {
            for (Integer i : li) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        backtrack(nums,0,new ArrayList<Integer>());
        return res;
    }

    private static void backtrack(int[] nums, int index, ArrayList<Integer> list) {
        if(index==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (!list.isEmpty() && list.contains(num)) {
                continue;
            }
            list.add(num);
            backtrack(nums, index + 1, list);
            list.remove(list.size() - 1);
        }
    }

}
