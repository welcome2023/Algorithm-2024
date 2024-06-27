package com.hwreal.day4.coding;

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
        boolean isError = n.length != 2 || Integer.parseInt(n[1]) <= 0 || Integer.parseInt(n[1]) > 5;
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
            dfs(list, new StringBuilder(),Integer.parseInt(n[1]), chars);
            System.out.println(list.size());
        }
    }

    private static void dfs( List<String> list, StringBuilder sb, int count, char[] cha) {
        if (count == 0) {
            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
                System.out.println(sb);
                return;
            }
            return;
        }
        for (int i = 0; i < cha.length; i++) {
            int len = sb.length();
            if ((len > 0 && sb.charAt(len - 1) == cha[i])) {
                continue;
            }
            sb.append(cha[i]);
            dfs(list, sb, count - 1, cha);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
