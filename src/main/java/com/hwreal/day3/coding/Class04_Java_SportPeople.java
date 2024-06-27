package com.hwreal.day3.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-18 23:03
 * @usage
 */
public class Class04_Java_SportPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i - 1] == 0 && arr[i + 1] == 0) {
                arr[i] = 1;
                count++;
            }
            if (arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
                arr[arr.length - 1] = 1;
                count++;
            }
            if (arr[0] == 0 && arr[1] == 0) {
                arr[0] = 1;
                count++;
            }
        }
        System.out.println(count);

    }
}
