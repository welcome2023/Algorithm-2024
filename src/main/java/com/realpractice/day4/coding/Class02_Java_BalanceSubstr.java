package com.realpractice.day4.coding;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 10:07
 * @usage
 */
public class Class02_Java_BalanceSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getRes(str);
    }
    public static void getRes(String str) {
        int count = 0;
        char[] cha = str.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : cha) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(map.firstKey()).equals(map.get(map.lastKey()))&&map.size()==2) {
                count++;
                map.remove(map.lastKey());
                map.remove(map.firstKey());
            }
        }
        System.out.println(count);
    }

}
