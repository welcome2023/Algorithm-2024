package com.javabasis;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-04 19:34
 * @usage
 */
public class DeepAndShallCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};

        // 浅拷贝
        int[] shallowCopy = originalArray;

        // 深拷贝
        int[] deepCopy = originalArray.clone();

        // 修改原始数组
        originalArray[0] = 99;

        // 输出结果
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Shallow Copy:   " + Arrays.toString(shallowCopy));
        System.out.println("Deep Copy:      " + Arrays.toString(deepCopy));
    }
}
