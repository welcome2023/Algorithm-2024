package com.realpractice.day10.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 21:49
 * @usage
 */
public class Class01_Java_NucleicAcid {
        public static int N;
        public static int[][] maps;
        //被感染的人
        public static TreeSet treeSet = new TreeSet<>();
        public static int res = 0;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            sc.nextLine();
            String[] strings = sc.nextLine().split(",");
            for(int i=0; i<strings.length; i++){
                treeSet.add(Integer.valueOf(strings[i]));
            }
            maps = new int[N][N];
            for(int i=0; i<N; i++){
                maps[i] = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
            }
            for(String str : strings){
                dfs(Integer.valueOf(str));
            }
            System.out.println(res);
        }
        public static void dfs(int ganran){
            for(int i=0; i<N; i++){
                if(maps[ganran][i] == 1 && !treeSet.contains(i)){
                    //与密接者接触的且还未被检测的人需要被检测
                    treeSet.add(i);
                    res ++;
                    dfs(i);
                }
            }
        }
    }
