package com.realpractice.day4.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 11:01
 * @usage
 */
public class Class04_Backtrack_StrConnect {
    static int num;
    static int sum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            num=Integer.valueOf(s.substring(s.length()-1));
            s=s.substring(0,s.length()-2);
        } catch (NumberFormatException e) {
            System.out.println(0);
            return;
        }
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        ArrayList<Integer> integers = new ArrayList<>();
        int[] bo = new int[chars.length];
        sum = 0;
        dfs123(chars, integers, bo);
        System.out.println(sum);
    }
    private static void dfs123(char[] chars, ArrayList<Integer> integers, int[] bo) {
        if (integers.size() == num) {
            sum++;
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (bo[i] == 0) {
                if (integers.size() == 0 || chars[i] != chars[integers.get(integers.size() - 1)]) {
                    if (i > 0 && chars[i] == chars[i - 1] && bo[i - 1] == 0) {
                        continue;
                    }
                    bo[i] = 1;
                    integers.add(i);
                    dfs123(chars, integers, bo);
                    bo[i] = 0;
                    integers.remove(integers.size() - 1);
                }
            }
        }
        return;
    }
}
