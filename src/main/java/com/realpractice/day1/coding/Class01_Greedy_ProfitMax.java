package com.realpractice.day1.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-14 20:52
 * @usage
 */
public class Class01_Greedy_ProfitMax {
    public static void main(String[] args) {
        for (Integer s : getRes(11)) {
            System.out.print(s+" ");
        }
    }
    public static List<Integer> getRes(int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k <= 4) {
            list.add(k);
            return list;
        }
        int a = (int) Math.round(Math.sqrt(k));
        boolean flag=true;
        while (flag){
            if (Math.pow(a, 2) == k) {
                list.add(a);
                list.add(a);
               flag=false;
            }else {
                list.add(a);
                list.add(a);
                list.add(k-2*a);
               flag=false;
            }
        }
        Collections.sort(list);
        return list;


    }

}
