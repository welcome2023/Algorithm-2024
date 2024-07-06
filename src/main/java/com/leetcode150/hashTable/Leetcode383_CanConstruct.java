package com.leetcode150.hashTable;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode383_CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []arr=new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            arr[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i)-'a']--;
        }

        for (int i : arr) {
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
