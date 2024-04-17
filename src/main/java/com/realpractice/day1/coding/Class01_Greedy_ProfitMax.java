package com.realpractice.day1.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 20:52
 * @usage
 */
public class Class01_Greedy_ProfitMax {
    public static Map<Integer, List<Integer>> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        getMaxProfit(X);
        List<Integer> resList = map.get(X);
        Collections.sort(resList);
        resList.forEach(data -> System.out.print(data + " "));
    }

    public static void getMaxProfit(int X) {
        int[] dp = new int[X + 1];
        for (int i = 1; i <= X; i++) {
            dp[i] = i;
            List<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(i, list);
            for (int j = 1; j < i; j++) {
                int count = dp[j] * dp[i - j];
                if (dp[i] < count) {
                    dp[i] = count;
                    list = new ArrayList<>();
                    list.addAll(map.get(j));
                    list.addAll(map.get(i - j));
                    map.put(i, list);
                } else if (dp[i] == count) {
                    //已经切割了，需要比较切割的段数
                    //之前切了 lengthOld 段
                    int lengthOld = map.get(i).size();
                    //当前切了 lengthNew 段
                    int lengthNew = map.get(j).size() + map.get(i - j).size();
                    if (lengthOld > lengthNew) {
                        //老的大于新的，则用新的方案
                        list = new ArrayList<>();
                        list.addAll(map.get(j));
                        list.addAll(map.get(i - j));
                        map.put(i, list);
                    }
                }
            }
        }
    }
}
