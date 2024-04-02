package com;


import javax.swing.*;
import java.lang.annotation.Target;
import java.nio.channels.NotYetBoundException;
import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
    int [][]arr={{1,0,1,0},{1,1,1,1},{1,1,1,0}};
        System.out.println(getSum(arr));

    }

    public static int getSum(int [][]c){
        int row=c.length;
        int col=c[0].length;
        List<int[]> allResult = new ArrayList<>();
        for (int i = row-1; i >= 0; i--) {
            int []result=new int[col+2];
            for (int j = 0; j < col; j++) {
                int k=i;
                while (k>=0&&c[k][j]==1){
                    result[j+1]++;
                    k--;
                }
            }
            allResult.add(result);
        }

        int res=0;
        for (int[] ints : allResult) {
            Stack<Integer> stack = new Stack<>();
            stack.add(0);
            for (int j = 1; j < ints.length; j++) {
                while (ints[j] < ints[stack.peek()]) {
                    int height = ints[stack.pop()];
                    int width = j - stack.peek() - 1;
                    res = Math.max(res, height * width);
                }
                stack.add(j);
            }

        }
        return res;



    }

}

