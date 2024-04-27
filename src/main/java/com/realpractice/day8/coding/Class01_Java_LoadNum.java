package com.realpractice.day8.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-25 23:46
 * @usage 3
 * huawei/computing/no/one
 * huawei/computing
 * huawei/
 */
public class Class01_Java_LoadNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Map<String, Integer>> source = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] arr = line.split("/");
                for (int j = 0; j < arr.length; j++) {
                    String segment = arr[j];
                    if (source.size() <= j) {
                        Map<String, Integer> map = new HashMap<>();
                        map.put(segment, 1);
                        source.add(map);
                    } else {
                        Map<String, Integer> map = source.get(j);
                        if (map.containsKey(segment)) {
                            map.put(segment, map.get(segment) + 1);
                        } else {
                            map.put(segment, 1);
                        }
                    }
                }
        }
        String reqLine = scanner.nextLine();
        String[] req = reqLine.split(" ");
        int reqLevel = Integer.parseInt(req[0]);
        String reqStr = req.length > 1 ? req[1] : "";
        int res = (source.size() > reqLevel && source.get(reqLevel).containsKey(reqStr)) ? source.get(reqLevel).get(reqStr) : 0;
        System.out.println(res);
    }
}
