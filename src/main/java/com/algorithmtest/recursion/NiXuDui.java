package com.algorithmtest.recursion;

/**
 * @createDate 2024-01-08 21:46
 * 逆序对问题:在一个数组中,左边的数如果比右边的数 大 ,则这两个数构成一个逆序对,请打印左右的逆序对;
 */
public class NiXuDui {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 3, 1};
        System.out.println(getNxd(arr));

    }
    public static int getNxd(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        return getNxd(arr, 0, arr.length - 1);
    }
    public static int getNxd(int[] arr, int l, int r) {
        if(l==r){
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return getNxd(arr, l, mid) + getNxd(arr, mid + 1, r) + getCount(arr, l, mid, r);
    }
    private static int getCount(int[] arr, int l, int m, int r) {
        int count = 0;
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        while (p1 <= m && p2 <= r) {
            count += arr[p1] > arr[p2] ? m - p1 + 1 : 0;
            // 此处有坑
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
        return count;
    }
}
