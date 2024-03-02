package com.algorithmtest.greedy;

import com.algorithmtest.bean.Program;
import com.algorithmtest.compare.ProgramComparator;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 16:57
 * @usage
 */
public class Class01_BestArrange {
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
