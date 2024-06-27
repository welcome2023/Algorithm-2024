package com.hwreal.day1.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 20:33
 */
public class Class05_Window_LongSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int oCount = 0;
        for (char c : st.toCharArray()) {
            if (c == 'o') {
                oCount++;
            }
        }
        System.out.println(oCount % 2 == 0 ? st.length() : st.length() - 1);
    }
}
