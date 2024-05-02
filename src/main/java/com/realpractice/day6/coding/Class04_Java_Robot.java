package com.realpractice.day6.coding;

import java.util.*;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-22 23:38
 * @usage 30 12 25 8 19
 */
public class Class04_Java_Robot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            int[] bricks = new int[s1.length];
            for (int i = 0; i < s1.length; i++) {
                bricks[i] = Integer.parseInt(s1[i]);
            }
            Arrays.sort(bricks);
            if (bricks.length > 8) {
                System.out.println(-1);
                continue;
            } else if (bricks.length == 8) {
                System.out.println(bricks[bricks.length - 1]);
                continue;
            }
            int times = 8 - bricks.length;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < times && i < bricks.length; i++) {
                int num = bricks[bricks.length - 1 - i] / 2;
                list.add(num);
                list.add(bricks[bricks.length - 1 - i] - num);
            }
            for (int i = 0; i < bricks.length - times; i++) {
                list.add(bricks[i]);
            }
            Integer max = Collections.max(list);
            System.out.println(max);
        }
    }
}
