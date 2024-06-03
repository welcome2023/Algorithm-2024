package com.Leetcode150.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 12:57
 * @usage
 */
public class Class04_Leetcode039_CombinationSum {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        for (List<Integer> ins : combinationSum(arr, 7)) {
            for (Integer in : ins) {
                System.out.print(in+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, new ArrayList<Integer>(),0);
        return res;
    }

    private static void backtrack(int[] candidates, int target, List<Integer> list,int start) {
        if (target <= 0) {
            if (target == 0) {
                res.add(new ArrayList<>(list));
                return;
            }
            return;

        }

        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(candidates, target - candidates[i], list,i);
            list.remove(list.size() - 1);
        }


    }


}
