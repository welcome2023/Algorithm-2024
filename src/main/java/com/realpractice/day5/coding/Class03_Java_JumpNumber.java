package com.realpractice.day5.coding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-21 22:05
 * @usage
 */
public class Class03_Java_JumpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().replace("[","").replace("]","").split(",")).mapToInt(Integer::parseInt).toArray();
        int jump = sc.nextInt();
        int count = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        int res=0;
        int flag=1;
        while (list.size()>count){
           int remove=(flag+jump)%list.size();
            list.remove(remove);
            flag=remove;
        }
        for (Integer i : list) {
            res+=i;
        }
        System.out.println(res);
    }
}
