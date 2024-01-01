package com.huawei;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @createDate 2023-12-25 22:52
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(4);
        integers.add(1);
        integers.add(3);
        integers.add(2);

        for (Integer integer : integers) {
            System.out.println(integer);

        }
    }
}
