package com;

import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        sc.nextLine();
        int[] hei = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] wei = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            int[] ints = new int[3];
            ints[0] = i + 1;
            ints[1] = hei[i];
            ints[2] = wei[i];
            list.add(ints);
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[2] - o2[2] : o1[1] - o2[1];
            }
        });
        for (int[] ints : list) {
            System.out.print(ints[0] + " ");
        }
    }
}
