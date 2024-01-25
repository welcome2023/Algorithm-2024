package com.algorithmtest.utils;

import com.algorithmtest.bean.Student;

import java.util.Comparator;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-25 21:24
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }
}
