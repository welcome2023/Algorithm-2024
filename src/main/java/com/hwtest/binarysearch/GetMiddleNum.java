package com.hwtest.binarysearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-26 23:21
 * @usage
 */
public class GetMiddleNum {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 7};
        int[] a2 = {4, 7, 8};
        System.out.println(findMedianSortedArrays(a1, a2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
                while (i == m && k < (m + n)) {
                    arr[k++] = nums2[j++];
                }
            } else {
                arr[k++] = nums2[j++];
                while (j == n && k < (m + n)) {
                    arr[k++] = nums1[i++];
                }
            }
        }
        return (m + n) % 2 == 0 ? (arr[(m + n) / 2] + arr[(m + n - 1) / 2]) / 2.0 : arr[(m + n) / 2];
    }

}
