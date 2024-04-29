package com;

import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (String str : strs) {
            String[] s = str.split("->");
            String left = s[0];
            String right = s[1];
            if(!map.containsKey(left)){
                map.put(left,new ArrayList<>());
            }
            map.get(left).add(right);
            if(!map.containsKey(right)){
                map.put(right,new ArrayList<>());
            }
        }

        while (!map.isEmpty()){
            executeTask(map,res);
            for (String key : map.keySet()) {
                List<String> values = map.get(key);
                Iterator<String> iterator = values.iterator();
                while (iterator.hasNext()){
                    if(!map.containsKey(iterator.next())){
                        iterator.remove();
                    }
                }
            }
        }
        for (String re : res) {
            System.out.println(re);
        }
    }
    private static void executeTask(HashMap<String, List<String>> map, ArrayList<String> res) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if(entry.getValue().isEmpty()){
                String key = entry.getKey();
                res.add(key);
                map.remove(key);
            }
        }
    }
}


