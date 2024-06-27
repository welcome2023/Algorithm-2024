package com.hwreal.day7.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-25 22:52
 * @usage
 */
public class Class05_Dynamic_MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aWei = sc.nextInt();
        int bWei = sc.nextInt();
        int totalWei = sc.nextInt();
        int aPro = sc.nextInt();
        int bPro = sc.nextInt();
        int res=0;
        for (int i = aWei; i < totalWei; i=i+aWei) {
            int bCount=(totalWei-i)/bWei;
            if(bCount>0&&bCount*bWei==totalWei-i){
                res= Math.max(res,i/aWei*aPro+bCount*bPro);
            }
        }
        System.out.println(res);
    }
}
