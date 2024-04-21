package com.realpractice.day5.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 17:20
 * @usage
 */
public class Class02_Java_DymisticCarNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }else {
                if(count!=0){
                    res++;
                    count=0;
                }
                continue;
            }
            if(count==3||i==arr.length-1){
                res++;
                count=0;
            }
        }
        System.out.println(res);
    }
}
