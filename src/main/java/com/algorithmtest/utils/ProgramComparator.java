package com.algorithmtest.utils;

import com.algorithmtest.bean.Program;

import java.util.Comparator;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 16:55
 * @usage
 */
public class ProgramComparator implements Comparator<Program> {
    @Override
    public int compare(Program o1, Program o2) {
        return o1.end-o2.end;
    }
}
