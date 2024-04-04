package com.hwtest.window;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-04 22:13
 * @usage
 */
public class Class03_LongestOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1};
        System.out.println(getSum(arr, 1));
    }

    public static int getSum(int[] arr, int k) {
        int l = 0, r = 0, count = 0, res = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                count++;
            }
            if (count > k) {
                if (arr[l] == 0) {
                    count--;
                }
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }


}
