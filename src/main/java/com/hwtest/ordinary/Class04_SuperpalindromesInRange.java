package com.hwtest.ordinary;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-30 15:57
 * @usage
 */
public class Class04_SuperpalindromesInRange {
    public static void main(String[] args) {
        System.out.println(superpalindromesInRange("4", "1000"));
    }
    public static int superpalindromesInRange(String left, String right) {
        int l = Integer.parseInt(left);
        int r = Integer.parseInt(right);
        int res=0;
        for (int i = l; i <= r; i++) {
            if(palind(i)){
                res++;
            }
        }
        return res;
    }

    private static boolean palind(double i) {
        String s = Integer.toString((int) i);
        int sqrt =(int) Math.sqrt(i);
        String m = Integer.toString(sqrt);
        return sqrt*sqrt==i&& s.equals(new StringBuilder(s).reverse().toString()) &&m.equals(new StringBuilder(m).reverse().toString());
    }
}
