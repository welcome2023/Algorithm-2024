package com.hwtest1part.greedy;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-18 23:38
 * @usage n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
 * 你需要按照以下要求，给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 相邻两个孩子评分更高的孩子会获得更多的糖果。
 * 请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。
 */
public class Class01_Candy {
    public static void main(String[] args) {
        int []arr={2,1,4};
        System.out.println(candy(arr));
    }
    public static int candy(int []arr){
        int[] candy = new int[arr.length];
        Arrays.fill(candy,1);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
                candy[i]+=1;
            }
        }
        for (int i = arr.length-2; i >=0; i--) {
            if(arr[i]>arr[i+1]){
                candy[i]+=1;
            }
        }
        int res=0;
        for (int i : candy) {
            res+=i;
        }
        return res;
    }

}
