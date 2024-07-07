package com.leetcode150.arrayAndString;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode344_ReverseString {
    public static void main(String[] args) {
        Leetcode344_ReverseString obj = new Leetcode344_ReverseString();
        char[]arr=new char[]{'a','b','b'};
        obj.reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void reverseString(char[] s) {
        for (int i = 0,j=s.length-1; i<j; i++,j--) {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}