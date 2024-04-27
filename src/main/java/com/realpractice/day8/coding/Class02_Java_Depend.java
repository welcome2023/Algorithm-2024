package com.realpractice.day8.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-27 22:33
 * @usage
 */
public class Class02_Java_Depend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        //任务的依赖关系
        // key：被依赖，value：依赖
        Map<Character, List<Character>> graph = new HashMap<>();
        //需要依赖任务的数量
        Map<Character, Integer> inDegree = new HashMap<>();
        for (String s : input) {
            String[] rule = s.split("->");
            char from = rule[1].charAt(0);
            char to = rule[0].charAt(0);
            if (!graph.containsKey(from)) {
                graph.put(from, new ArrayList<>());
            }
            graph.get(from).add(to);
            inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);
        }

        TreeSet<Character> treeSet = new TreeSet<>();
        for (char c : graph.keySet()) {
            if (!inDegree.containsKey(c)) {
                //单独的，需要依赖任何任务
                treeSet.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!treeSet.isEmpty()) {
            for (Character c : treeSet) {
                sb.append(c + " ");
            }
            List<Character> list = new ArrayList<>(treeSet);
            treeSet.clear();
            for (Character c : list) {
                if (graph.containsKey(c)) {
                    //遍历依赖 c 的所有任务
                    for (char next : graph.get(c)) {
                        //next 任务减去一个依赖关系
                        inDegree.put(next, inDegree.get(next) - 1);
                        if (inDegree.get(next) == 0) {
                            //如果此时 next 的依赖关系为0，则说明可以执行
                            treeSet.add(next);
                        }
                    }
                }
            }
        }

        System.out.println(sb.toString().trim());
    }

}
