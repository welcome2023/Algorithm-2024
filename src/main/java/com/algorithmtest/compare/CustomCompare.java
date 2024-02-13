package com.algorithmtest.compare;

import com.algorithmtest.bean.Student;
import com.algorithmtest.utils.IdAscendingComparator;

import java.util.Arrays;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-23 22:24
 */
public class CustomCompare {
    public static void main(String[] args) {
        Student stu1 = new Student("a", 21, "beiji");
        Student stu2 = new Student("a", 28, "shanghai");
        Student stu3 = new Student("a", 22, "xian");

        Student[] students = new Student[]{stu1,stu2,stu3};
        Arrays.sort(students, new IdAscendingComparator());
        for (Student s : students) {
            System.out.println(s);
        }



    }
}
