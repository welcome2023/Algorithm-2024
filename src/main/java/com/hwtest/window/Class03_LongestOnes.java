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

    public static int getSum(int[] A, int K) {
        int N = A.length;
        int res = 0;
        int left = 0, right = 0;
        int zeros = 0;
        while (right < N) {
            if (A[right] == 0)
                zeros ++;
            while (zeros > K) {
                if (A[left++] == 0)
                    zeros --;
            }
            res = Math.max(res, right - left + 1);
            right ++;
        }
        return res;
    }

    }


