    package com.leetcode150.slipWindow;

    /**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是回文数
 */
public class Leetcode125_IsPalindrome2 {
    public static void main(String[] args) {
        Leetcode125_IsPalindrome2 obj = new Leetcode125_IsPalindrome2();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));

    }
    public boolean isPalindrome(String s) {
        // 将字符串做处理
        String line=process(s);
        // 判断是否是回文数
        int length = line.length();
        int left=0;
        int right=length-1;

        char[] cha = line.toCharArray();
        while (left<=right){
            if(cha[left]!=cha[right]){
               return false;
            }
            left++;
            right--;

        }
        return true;
    }

    private String process(String s) {
        String s1 = s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (char c : s1.toCharArray()) {
            if(Character.isDigit(c)||Character.isLetter(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
