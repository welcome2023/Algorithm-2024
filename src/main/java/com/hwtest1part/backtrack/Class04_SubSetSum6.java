package com.hwtest1part.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-31 23:52
 * @usage
 */
public class Class04_SubSetSum6 {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        for (List<Integer> ress : getSubList(arr,6)) {
            System.out.println(ress);
        }
    }
    public static List<List<Integer>> getSubList(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, targetSum, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int targetSum, int start) {
        if (targetSum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length && targetSum >= nums[i]; i++) {
            current.add(nums[i]);
            backtrack(result, current, nums, targetSum - nums[i], i + 1); // 注意这里的目标和减去当前值
            current.remove(current.size() - 1); // 回溯
        }
    }



    }



