package com.realpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-16 0:52
 * @usage 寻找最富裕的小家庭
 */
public class Class07_Java_MostRichFamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            // 在上述代码片段中，nextInt() 方法读取一个整数后并不会自动读取紧跟其后的换行符。
            // 因此，在调用 nextInt() 后立即调用 nextLine() 可能会立即返回一个空字符串，因为 nextInt() 没有消耗掉换行符。
            // 报错信息:For input string: ""
            sc.nextLine();
            int[] ints = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                int father = sc.nextInt();
                int child = sc.nextInt();
                map.put(father, map.getOrDefault(father, ints[father - 1]) + ints[child - 1]);
            }
            int max = 0;
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                max = Math.max(m.getValue(), max);
            }
            System.out.println(max);
        }
    }
}
