package com.algorithmdoor.recursion;

/**
 * @createDate 2024-01-07 20:59
 */
public class GetMax {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 8, 9, 3, 4, 6, 7, 3, 2};
        System.out.println(process(arr, 0, arr.length - 1));
    }
    public static int process(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int mid = L + ((R - L) >> 1);
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);

    }


}
