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
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean isDigit = false, isLowerCase = false, isUpperCase = false, isLetter = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '<' && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
                if (Character.isDigit(c)) {
                    isDigit = true;
                } else if (Character.isLowerCase(c)) {
                    isLowerCase = true;
                } else if (Character.isUpperCase(c)) {
                    isUpperCase = true;
                } else {
                    isLetter = true;
                }
            }
        }
        boolean isTrue = sb.length() >= 8 && isDigit && isLetter && isLowerCase && isUpperCase;
        System.out.println(sb + "," + isTrue);
    }
}
