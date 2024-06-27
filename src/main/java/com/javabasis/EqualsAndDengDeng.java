package com.javabasis;

import com.algorithmdoor.bean.Student;

/**
 * @author cmsxyz@163.com
 * @date 2024-06-04 19:50
 * @usage
 */
public class EqualsAndDengDeng {
    public static void main(String[] args) {
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println("-----------equals---------------");
        System.out.println(x.equals(y));
        System.out.println(x==y);
        System.out.println("-----------= =---------------");
        int a=2;
        int b=2;
        System.out.println(a==b);
        Student m = new Student("a", 1, "b");
        Student n = new Student("a", 1, "b");
        System.out.println(m.equals(n));
        System.out.println(m==n);
    }
}
