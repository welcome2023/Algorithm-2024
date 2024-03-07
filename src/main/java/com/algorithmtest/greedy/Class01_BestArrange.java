package com.algorithmtest.greedy;

import com.algorithmtest.bean.Program;
import com.algorithmtest.utils.ProgramComparator;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 16:57
 * @usage
 */
public class Class01_BestArrange {
    public static void main(String[] args) {
        Program[] pro = new Program[6];
        pro[0]=new Program(1,3);
        pro[1]=new Program(2,3);
        pro[2]=new Program(3,6);
        pro[3]=new Program(3,5);
        pro[4]=new Program(4,7);
        pro[5]=new Program(5,6);
        System.out.println(bestArrange(pro, 2));
    }
    public static int bestArrange(Program[] programs, int timePoint) {
        Arrays.sort(programs, new ProgramComparator());
        int result = 0;
        for (int i = 0; i < programs.length; i++) {
            if (timePoint <= programs[i].start) {
                result++;
                timePoint = programs[i].end;
            }
        }
        return result;
    }
}
