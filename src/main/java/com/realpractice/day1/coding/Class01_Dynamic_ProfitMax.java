package com.realpractice.day1.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 20:52
 * @usage
 */
public class Class01_Dynamic_ProfitMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len= scanner.nextInt(),aswlen=0,aswmark=-1,i;
        for(i=1;i<len;i++){
            int aswnow=1,l1=len/i,s1=len%i;
            for(int j=0;j<i;j++){
                if(j+s1>=i){
                    aswnow=aswnow*(l1+1);
                }else {
                    aswnow=aswnow*l1;
                }
            }
            if(aswnow>aswlen){
                aswlen=aswnow;
                aswmark=i;
            }
        }
        int l1=len/aswmark,s1=len%aswmark;
        for(int j=0;j<aswmark;j++){
            if(j+s1>=aswmark){
                System.out.print((l1+1)+" ");
            }else {
                System.out.print(l1+" ");
            }
        }
    }
}
