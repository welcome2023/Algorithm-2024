package com.realpractice.day4.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 11:39
 * @usage
 */
public class Class05_Java_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cha = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char value : cha) {
            if (sb.length() > 0 && value == '<') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (value != '<') {
                sb.append(value);
            }
        }
        boolean isDig = false, isUpper = false, isLower = false, isLetter = false;
        for (char c : sb.toString().toCharArray()) {
            if (Character.isDigit(c)) {
                isDig = true;
            }
            if (Character.isUpperCase(c)) {
                isUpper = true;
            }
            if (Character.isLowerCase(c)) {
                isLower = true;
            }
            if (Character.isLetter(c)) {
                isLetter = true;
            }
        }

        System.out.println(isDig && isUpper && isLetter && isLower ? sb + "," + true : sb + "," + false);
    }
}
