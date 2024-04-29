package com.realpractice.day10.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 22:10
 * @usage
 */
public class Class02_Java_UniversalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextLine());
        }
        String chars = sc.nextLine();
        int res = 0;
        for (String str : list) {
            //StringBuilder方便删除字符
            StringBuilder newChars = new StringBuilder(chars);
            //用来判断是否匹配完成
            boolean flag = true;
            for (char c : str.toCharArray()) {
                if (newChars.indexOf(String.valueOf(c)) != -1) {
                    //存在这个字符则直接删除
                    newChars.deleteCharAt(newChars.indexOf(String.valueOf(c)));
                } else if (newChars.indexOf("?") != -1) {
                    //不存在当前字符且存在？，则使用万能字符，同时删除一个万能字符
                    newChars.deleteCharAt(newChars.indexOf("?"));
                } else {
                    //确实匹配不了则退出
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res++;
            }
        }
        System.out.println(res);
    }
}
