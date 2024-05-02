package com.realpractice.day4.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-20 11:01
 * @usage
 */
public class Class04_Backtrack_StrConnect {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        String s = n[0];
        boolean isError = false;
        if (n.length != 2 || !n[1].matches("\\d+")) {
            isError = true;
        }
        if (s.length() <= 0 || s.length() > 30) {
            isError = true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i))) {
                isError = false;
                break;
            }
        }
        if (isError) {
            System.out.println(0);
        } else {
            char[] chars = s.toCharArray();
            handle(Integer.parseInt(n[1]), new StringBuilder(), chars, new ArrayList<>());
            System.out.println(list.size());
        }
    }
    public static void handle(int count, StringBuilder str, char[] chars, List<Integer> indexList) {
        if (count == 0) {
            String newStr = new String(str);
            if (!list.contains(newStr)) {
                list.add(newStr);
                System.out.println(newStr);
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                int len = str.length();
                if ((len > 0 && str.charAt(len - 1) == chars[i]) || indexList.contains(i)) {
                    continue;
                }
                indexList.add(i);
                handle(count - 1, str.append(chars[i]), chars, indexList);
                indexList.remove(indexList.size() - 1);
                str.deleteCharAt(str.length() - 1);
            }
        }
    }

}
