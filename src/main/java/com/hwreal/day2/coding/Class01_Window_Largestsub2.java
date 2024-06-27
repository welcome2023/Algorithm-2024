package com.hwreal.day2.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 23:06
 * @usage
 */
public class Class01_Window_Largestsub2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] cha = str.toCharArray();
        int left = 0, right = 0, res = 0, count = 0;
        boolean ziMu = false;
        while (right < cha.length) {
            if (Character.isDigit(cha[right])) {
                count++;
            }
            if (Character.isLowerCase(cha[right]) || Character.isUpperCase(cha[right])) {
                ziMu = true;
            }
            while (count >= 2) {
                if (Character.isDigit(cha[left])) {
                    count--;
                }
                left++;
            }
            if (ziMu) {
                res = Math.max(res, right - left + 1);
            }
            right++;
        }
        System.out.println(count == 1 && cha.length > 1 && res != 0 ? res : -1);
    }
}
