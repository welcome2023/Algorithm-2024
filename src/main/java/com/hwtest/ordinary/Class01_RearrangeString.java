package com.hwtest.ordinary;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-30 11:09
 * @usage
 */
public class Class01_RearrangeString {
    public static void main(String[] args) {
        System.out.println(getMaxSodas(6));
    }
    public static Integer getMaxSodas(int n) {
    int total=0;
    while (n/3>0){
        total+=n/3;
        n=n/3+n%3;
    }
    if(n==2){
        total+=1;
    }
    return total;
    }

}
