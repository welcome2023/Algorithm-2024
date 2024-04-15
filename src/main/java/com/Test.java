package com;

import java.util.Arrays;
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
        while (sc.hasNext()){
            int n = sc.nextInt();
            sc.nextLine();
            int[] money = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 1; i <= n - 1; i++) {
                int sub=sc.nextInt();
                int child=sc.nextInt();
                map.put(sub,  map.getOrDefault(sub,money[sub-1])+money[child-1]);
            }
            int max=0;
            for (Map.Entry<Integer, Integer> a : map.entrySet()) {
                max=Math.max(max,a.getValue());
            }
            System.out.println(max);
        }
    }
}

