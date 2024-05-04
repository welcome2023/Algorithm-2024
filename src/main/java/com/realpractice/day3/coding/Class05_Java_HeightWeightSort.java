package com.realpractice.day3.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-18 23:03
 * @usage
 */
public class Class05_Java_HeightWeightSort {
    public static void main(String[] args) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < a.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i+1);
            list.add(a[i]);
            list.add(b[i]);
            lists.add(list);
        }
        lists.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).equals(o2.get(1))?o1.get(2)-o2.get(2):o1.get(1)-o2.get(1);
            }
        });

        for (List<Integer> integers : lists) {
            System.out.println(integers.get(0));
        }
    }


}
