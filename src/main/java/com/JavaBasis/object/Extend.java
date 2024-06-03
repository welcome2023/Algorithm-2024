package com.JavaBasis.object;

import com.algorithmtest.bean.Student;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-30 22:31
 * @usage
 */
public class Extend extends Student {
    public static void main(String[] args) {
        Extend extend = new Extend();
        String name = extend.getName();
        System.out.println(name);
    }
}
