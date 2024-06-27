package com.hwreal.day9.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 17:02
 * @usage
 * 2 8 3 7 3 6 3 5 4 4 5 3 6 2 7 3 8 4 7 5
 */
public class Class05_Java_ZipXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < nums.length; i++) {
            if(i%2==1){
                int[] ints = new int[2];
                ints[0]=nums[i-1];
                ints[1]=nums[i];
                list.add(ints);
            }
        }
        List<int[]> resList = new ArrayList<>();
        resList.add(list.get(0));
        for (int i = 2; i < list.size(); i++) {
            if (!isMatch(list.get(i - 2), list.get(i - 1), list.get(i))) {
                resList.add(list.get(i - 1));
            }
        }
        resList.add(list.get(list.size() - 1));
        StringBuilder res = new StringBuilder();
        for (int[] ints : resList) {
            res.append(ints[0]).append(" ").append(ints[1]).append(" ");
        }
        System.out.println(res);
    }
    public static boolean isMatch(int[] a, int[] b, int[] c) {
        if (a[0] == b[0]) {
            return b[0] == c[0];
        } else if (a[1] == b[1]) {
            return b[1] == c[1];
        } else return Math.abs(c[0] - a[0]) == 2 && Math.abs(c[1] - a[1]) == 2;
    }
}
