package com.leetcode150.arrayAndString;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage
 */
public class Leetcode151_ReverseWords {
    public static void main(String[] args) {
        Leetcode151_ReverseWords obj = new Leetcode151_ReverseWords();
        System.out.println(obj.reverseWords("a good   example"));

    }
    public String reverseWords(String s) {
        // 1.将s按照空格切割,转化为字符数组
        String a = s.trim();
        String[] line = a.split("[ ]+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0,j=line.length-1; i<j; i++,j--) {
            String temp=line[i];
            line[i]=line[j];
            line[j]=temp;

        }
        // 2.字符串数组不能交换位置,直接sb,倒序遍历
        for (String s1 : line) {
            sb.append(s1).append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }
}