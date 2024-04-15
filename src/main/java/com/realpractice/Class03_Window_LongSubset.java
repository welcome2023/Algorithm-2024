package com.realpractice;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 20:33
 * @usage 给定一个字符串，只包含字母和数字，按要求找出字符串中的最长（连续）子串的长度，
 * 字符串本身是其最长的子串，
 * 子串要求：只包含 1 个字母(a~z, A~Z)，其余必须是数字；
 *          如果找不到满足要求的子串，如全是字母或全是数字，则返回-1。
 */
public class Class03_Window_LongSubset {
    public static void main(String[] args) {
        System.out.println(getRes("qewqw12"));
    }

    public static int getRes(String str) {
        int left = 0, right = 0, res = 0, count = 0;
        while (right < str.length()) {
            if (!(str.charAt(right) >= '0' && str.charAt(right) <= '9')) {
                count++;
            }
            while (count>1){
                left=right;
                count--;
            }
            if(!(str.charAt(right) >= '0' && str.charAt(right) <= '9')){
                right++;
                continue;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
