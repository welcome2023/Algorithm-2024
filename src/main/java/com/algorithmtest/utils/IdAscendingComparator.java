package com.algorithmtest.utils;


import com.algorithmtest.bean.Student;

import java.util.Comparator;

public class IdAscendingComparator implements Comparator<Student> {
    // 返回负数,第一个参数排在前面,升序
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}