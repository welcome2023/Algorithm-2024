package com;


/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(num1(8));
    }

    public static int num1(int n) {
        if (n < 1) {
            return 0;
        }
        int[] record = new int[n];
        return process1(0, record, n);
    }

    private static int process1(int i, int[] record, int n) {
        if (i == n) {
            return 1;
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            if (isVaild(record, i, j)) {
                record[i] = j;
                res += process1(i + 1, record, n);
            }
        }
        return res;
    }

    private static boolean isVaild(int[] record, int i, int j) {
        for (int k = 0; k < i; k++) {
            if (record[k] == j || Math.abs(i-k)==Math.abs(record[k]-j)) {
                return false;
            }
        }
        return true;
    }
}