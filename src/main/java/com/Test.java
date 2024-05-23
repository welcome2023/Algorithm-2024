package com;

import java.util.ArrayList;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.remove(1);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}


