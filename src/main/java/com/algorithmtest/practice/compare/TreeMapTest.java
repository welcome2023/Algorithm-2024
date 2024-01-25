package com.algorithmtest.practice.compare;

import com.algorithmtest.bean.Student;
import com.algorithmtest.utils.StudentComparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-25 21:22
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student,Integer> studentTreeMap = new TreeMap<>(new StudentComparator());
        Student stu1 = new Student("a",23,"bei");
        Student stu2 = new Student("b",27,"bei");
        Student stu3 = new Student("c",20,"bei");

        studentTreeMap.put(stu1,15);
        studentTreeMap.put(stu2,13);
        studentTreeMap.put(stu3,22);

        Set<Map.Entry<Student, Integer>> entries = studentTreeMap.entrySet();
        for (Map.Entry<Student, Integer> entry : entries) {
            System.out.println(entry.getKey());
        }
    }
}
