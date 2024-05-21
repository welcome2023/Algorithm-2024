package com.hwtest2part.day0521;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-21 20:18
 * @usage 求数组中某个元素的下标
 * @describe 这道题目的前提是数组为有序数组，同时题目还强调数组中无重复元素
 */
public class Class01_Java_BinarySort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,12,23};
        int target=23;
        System.out.println(getIndex(arr, target));
    }

    private static int getIndex(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){
                right=mid-1;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
