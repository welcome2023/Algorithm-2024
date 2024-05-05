package com;

import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackN = new Stack<>();
        Stack<Character> stackF = new Stack<>();
        char[] cha = sc.nextLine().toCharArray();
        String st = "";
        for (int i = 0; i < cha.length; i++) {
            if (Character.isDigit(cha[i])) {
                st += cha[i];
                if (i == cha.length - 1) {
                    int n = Integer.parseInt(st);
                    Character f = stackF.peek();
                    if (f == '#') {
                        stackN.add(n);
                    } else {
                        Integer m = stackN.pop();
                        stackF.pop(); // 漏了
                        stackN.add(getDol(m, n));
                    }
                }
            } else {
                int n = Integer.parseInt(st);
                if (stackF.isEmpty()) {
                    stackN.add(n);
                    st = "";
                    stackF.add(cha[i]);
                } else {
                    Character m = stackF.peek();
                    st = "";
                    if (m == '#') {
                        stackN.add(n);
                    } else {
                        Integer k = stackN.pop();
                        stackF.pop();
                        stackN.add(getDol(k, n));
                    }
                    stackF.add(cha[i]);
                }

            }
        }
        while (stackN.size() > 1) {
            stackN.add(getJin(stackN.pop(), stackN.pop()));
        }
        System.out.println(stackN.peek());



    }


    public static int getJin(int i, int j) {
        return 2 * i + 3 * j + 4;
    }

    public static int getDol(int i, int j) {
        return 3 * i + j + 2;
    }
}
