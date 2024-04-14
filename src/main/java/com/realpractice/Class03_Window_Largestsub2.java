package com.realpractice;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 23:06
 * @usage
 */
public class Class03_Window_Largestsub2 {
    public static void main(String[] args) {
        System.out.println(getRes1("alolobo"));
    }
    public static int getRes(String str) {
        String sCircle = str + str;
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < i + str.length(); j++) {
                if (sCircle.charAt(j) == 'o') {
                    count++;
                }
                if (count % 2 == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }


    public static int getRes1(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='o'){
                count++;
            }
        }
        return count%2==0? str.length():str.length()-1;
    }
}
