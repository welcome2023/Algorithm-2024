package com.realpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 22:59
 * @usage 给定一个字符串 s，最多只能进行一次变换，
 * 返回变换后能得到的最小字符串（按照字典序
 * 进行比较）。
 */
public class Class07_Java_ChangeOneChar {
    public static void main(String[] args) {
        String str = "aera";
        char[] cArr = str.toCharArray();
        char tmp = cArr[0];
        int tmpIndex = 0;
        for (int left = 0; left < cArr.length; left++) {
            tmp = cArr[left];
            tmpIndex = left;
            for (int i = left; i < cArr.length; i++) {
                if (cArr[i] < tmp) {
                    tmp = cArr[i];
                    tmpIndex = i;
                }
            }

            if (tmpIndex != left) {
                cArr[tmpIndex] = cArr[left];
                cArr[left] = tmp;
                break;
            }
        }

        str = String.valueOf(cArr);
        System.out.println(str);

    }

    public static String getRes(String st) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a,b)->a.getKey()-b.getKey());
        for (int i = 0; i < st.length(); i++) {
            map.put(st.charAt(i), i);
        }
        heap.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        int change = 1;
        int index = Integer.MAX_VALUE;
        int flag = -1;

        for (int i = 0; i < st.length(); i++) {
            if (!heap.isEmpty() && (st.charAt(i) == heap.peek().getKey() || change == 0)) {
                if (i == index) {
                    sb.append(st.charAt(flag));
                    continue;
                }
                sb.append(st.charAt(i));
                heap.poll();
            } else {
                Map.Entry<Character, Integer> minMap = heap.peek();
                index = minMap.getValue();
                flag = i;
                sb.append(minMap.getKey());
                change--;
            }
        }
        return sb.toString();
    }

}
