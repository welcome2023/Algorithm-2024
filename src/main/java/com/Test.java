package com;

import java.util.Scanner;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m=n+1;
        while (getRes(m)!=getRes(n)){
            m++;
        }
        System.out.println(m);
    }

    public static int getRes(int n){
        int count=0;
        while (n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }


}


