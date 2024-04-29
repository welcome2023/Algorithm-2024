package com.realpractice.day8.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 18:25
 * @usage
 */
public class Class02_Java_Depends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] depArr = line.split(" ");
        Map<String, List<String>> depMap = new TreeMap<>();
        List<String> result = new ArrayList<>();
        for (String dep : depArr) {
            String[] task = dep.split("->");
            String left = task[0];
            String right = task[1];
            if (!depMap.containsKey(left)) {
                depMap.put(left, new ArrayList<>());
            }
            depMap.get(left).add(right);
            if (!depMap.containsKey(right)) {
                depMap.put(right, new ArrayList<>());
            }
        }
        while (!depMap.isEmpty()) {
            executeTask(depMap, result);
            for (String key : depMap.keySet()) {
                List<String> depList = depMap.get(key);
                Iterator<String> depIterator = depList.iterator();
                while (depIterator.hasNext()) {
                    if (!depMap.containsKey(depIterator.next())) {
                        depIterator.remove();
                    }
                }
            }
        }
        System.out.println(String.join(" ", result));
    }

    public static void executeTask(Map<String, List<String>> depMap, List<String> result) {
        Iterator<Map.Entry<String, List<String>>> iterator = depMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = iterator.next();
            if (entry.getValue().isEmpty()) {
                result.add(entry.getKey());
                iterator.remove();
            }
        }
    }
}
