package com.leetcode150.math;

import com.leetcode150.arrayAndString.Leetcode028_StrStr;

import java.util.ArrayList;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode066_PlusOne {
    public static void main(String[] args) {
        for (int i : plusOne(new int[]{1, 2, 3})) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> res = new ArrayList<>();
        int capacity = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            res.add((capacity+digits[i])%10);
            capacity=(capacity+digits[i])/10;
        }
        if(capacity==1){
            res.add(1);
        }
        int[] arr = new int[res.size()];
        for (int i = res.size() - 1; i >= 0; i--) {
            arr[res.size() - 1 - i] = res.get(i);
        }
        return arr;

    }

}