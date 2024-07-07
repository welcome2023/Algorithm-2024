package com.leetcode150.math;

import javax.swing.plaf.basic.BasicSplitPaneUI;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode009_AddTwoNumbers {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        // 1.求x的位数
        int count=0;
        int num=x;
        while (x>0){
            x/=10;
            count++;
        }
        int left=0;
        int right=count-1;
        while (left<right){
            String line = String.valueOf(num);
            if(line.charAt(left)!=line.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
}