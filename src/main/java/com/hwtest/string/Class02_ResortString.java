package com.hwtest.string;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-05 23:25
 * @usage
 */
public class Class02_ResortString {
    public static void main(String[] args) {
        System.out.println(resortString("aabcbdd", 3));
    }
    public static String resortString(String s, int k) {
        if (k <= 1) {
            return s;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // 1.大根堆
        maxHeap.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder(s.length());
        // 2.队列
        Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();
            sb.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue() - 1);
            queue.offer(currentEntry);
            if (queue.size() == k) {
                Map.Entry<Character, Integer> entry = queue.poll();
                if (entry.getValue() > 0) {
                    maxHeap.add(entry);
                }
            }
        }
        return sb.length() == s.length() ? sb.toString() : "";
    }
}
