package com.hwtest.window;

import java.util.TreeMap;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-04 23:57
 * @usage
 */
public class Class04_LongestArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 7, 6, 5};
        System.out.println(longestSubarray(arr, 2));
    }

    public static int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int n = nums.length;
        int left = 0, right = 0;
        int res = 0;
        while (right < n) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }

}
