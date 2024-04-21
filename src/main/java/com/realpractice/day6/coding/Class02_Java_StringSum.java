package com.realpractice.day6.coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-21 23:59
 * @usage
 */
public class Class02_Java_StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        while (!Character.isDigit(str.charAt(left))) {
            left++;
        }
        while (!Character.isDigit(str.charAt(right))) {
            right--;
        }
        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        String sub = str.substring(left, right + 1);
        for (int i = 0; i < sub.length(); i++) {
            map.put(i, sub.charAt(i));
        }
        int flag = -1;
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if (entry.getValue() == '-') {
                flag = entry.getKey();
            }
        }
        int res = 0;
        int res1=0;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if (flag == -1) {
                res+=Integer.parseInt(String.valueOf(entry.getValue()));
            } else {
                if (entry.getKey() < flag) {
                    res1 += Integer.parseInt(String.valueOf(entry.getValue()));
                }
                if (entry.getKey() > flag) {
                    sb.append(entry.getValue());
                }
            }
        }
        System.out.println(flag==-1?res:res1-Integer.parseInt(sb.toString()));
    }
}

