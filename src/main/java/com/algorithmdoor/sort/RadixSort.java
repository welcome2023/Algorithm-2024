package com.algorithmdoor.sort;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-17 22:06
 */
public class RadixSort {
    public static void main(String[] args) {
        int []arr={1,12,123,65,23,789};
        radixSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void radixSort(int[]arr){
        if(arr==null||arr.length<2){
            return;
        }
        radixSort(arr,0,arr.length-1,maxBits(arr));
    }

    /**
     *
     * @param arr 数组
     * @param l   一堆数的左边界
     * @param r   一堆数的右边界
     * @param digit 最大值有几位
     */
    public static void radixSort(int []arr,int l,int r,int digit){
        final int radix=10;
        int i=0,j=0;
        int []bucket =new int[r-l+1];
        for (int d = 1; d <= digit; d++) {
            // 10 个空间
            // count[0] 当前位(d位) 是0的数字有多少个
            int []count=new int[radix];
            for ( i = l; i <= r; i++) {
                j=getDigit(arr[i],d);
                count[j]++;
            }
            for ( i = 1; i < radix; i++) {
                count[i]=count[i]+count[i-1];
            }
            for ( i = r; i >= l; i--) {
                j=getDigit(arr[i],d);
                bucket[count[j]-1]=arr[i];
                count[j]--;
            }
            for (i = l,j=0; i <= r; i++,j++) {
                arr[i]=bucket[j];
            }
        }
    }

    /**
     *
     * @param x 输入x
     * @param d 第几位
     * @return 得到第几位上的值
     */
    private static int getDigit(int x, int d) {
        return ((x/((int)Math.pow(10,d-1)))%10);
    }



    /**
     *
     * @param arr 待排序数组
     * @return  返回的数组中最大值一共几位
     */

    private static int maxBits(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        int res=0;
        while (max!=0){
            res++;
            max/=10;
        }

        return res;
    }




}
