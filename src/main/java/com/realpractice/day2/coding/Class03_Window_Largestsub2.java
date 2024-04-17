package com.realpractice.day2.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 23:06
 * @usage
 */
public class Class03_Window_Largestsub2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(getRes(st));
    }

    public static int getRes(String st) {
        char[] cha = st.toCharArray();
        int count = 0, left = 0, right = 0, num = 0;
        while (right < cha.length) {
            if (!isNumber(cha, right)) {
                num++;
            }
            while (num > 1) {
                if(!isNumber(cha, left)){
                    num--;
                }
                left++;
            }
            count = Math.max(count, right - left + 1);
            right++;
        }
        return count;
    }

    public static boolean isNumber(char[] cha, int i) {
        return cha[i] - 1 >= 47 && cha[i] - 1 <= 56;
    }
}
