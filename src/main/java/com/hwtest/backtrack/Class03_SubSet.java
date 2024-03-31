package com.hwtest.backtrack;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-31 23:52
 * @usage
 */
public class Class03_SubSet {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        for (List<Integer> ress : getSubList(arr)) {
            System.out.println(ress);
        }
    }
    public static List<List<Integer>> getSubList(int []nums){
        List<List<Integer>> subSets = new ArrayList<>();
        backtrack(subSets,new ArrayList<>(),0,nums);
        return subSets;
    }

    private static void backtrack(List<List<Integer>> subSets, ArrayList<Integer> current, int start, int[] nums) {
            subSets.add(new ArrayList<>(current));
            for (int i = start; i < nums.length; i++) {
                current.add(nums[i]);
                backtrack(subSets,current,i+1,nums);
                current.remove(current.size()-1);
            }



    }
}
