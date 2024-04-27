package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Map<String, Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("/");
            for (int j = 0; j < arr.length; j++) {
                HashMap<String, Integer> map = new HashMap<>();
                if(list.size()<=j){
                    map.put(arr[j],1);
                    list.add(map);
                }else {
                    Map<String, Integer> map1 = list.get(j);
                    if(map1.containsKey(arr[j])){
                        map1.put(arr[j],map1.get(arr[j])+1);
                    }else {
                        map1.put(arr[j],1);
                    }
                }
            }
        }
        String[] arr = sc.nextLine().split(" ");
        Map<String, Integer> map = list.get(Integer.parseInt(arr[0]));
        System.out.println(map.getOrDefault(arr[1], null));
    }
}


