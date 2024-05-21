package com.hwtest2part.day0521;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-21 21:47
 * @usage
 */
public class Class04_Backtrack_NQueenInt {
    public static void main(String[] args) {
        System.out.println(process(8));
    }

    public static int process(int n) {
        int[] record = new int[n];
        return bracktrack(n, 0, record);
    }

    private static int bracktrack(int n, int i, int[] record) {
        if (n == i) {
            return 1;
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            if (isValid(record, i, j)) {
                record[i] = j;
                res += bracktrack(n, i + 1, record);
            }
        }
        return res;
    }

    private static boolean isValid(int[] record, int i, int j) {
        for (int k = 0; k < i; k++) {
            if (record[k] == j || (Math.abs(i - k) == Math.abs(record[k] - j))) {
                return false;
            }
        }
        return true;
    }
}
