package com.hwreal.day10.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 21:49
 * @usage
 */
public class Class01_Java_NucleicAcid {
    public static int n;
    public static int[][]chess;
    public static TreeSet<Integer> set=new TreeSet<>();
    static  int res=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        int []arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        for (int i : arr) {
            set.add(i);
        }
        chess=new int[n][n];
        for (int i = 0; i < n; i++) {
            chess[i]=Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i : arr) {
            dfs(i);
        }
        System.out.println(res);
    }

    public static void dfs(int ganran){
        for(int i=0; i<n; i++){
            if(chess[ganran][i] == 1 && !set.contains(i)){
                //与密接者接触的且还未被检测的人需要被检测
                set.add(i);
                res ++;
                dfs(i);
            }
        }
    }
    }
