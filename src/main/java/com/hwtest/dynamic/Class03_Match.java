package com.hwtest.dynamic;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-26 20:46
 * @usage
 */
public class Class03_Match {
    public static void main(String[] args) {
        System.out.println(isMatch("abb", "a.b"));
    }
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public static boolean matches(String s, String p, int i, int j) {
        // i从0开始，j从1开始，往前回溯时 if i==0,i-1则报错
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

}
