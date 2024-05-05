package com.realpractice.day5.coding;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-21 23:06
 * @usage 7#6$5#12 = 226
 */
public class Class04_Java_Martian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Deque<Integer> num = new ArrayDeque<>();
        Deque<Character> fuhao = new ArrayDeque<>();
        String str = "";    //用来保存数字字符串
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);   //考虑到多位数需要拼接
                if (i == s.length() - 1) {    //最后一个字符
                    int n = Integer.valueOf(str);   //最后一个肯定是数字
                    char f = fuhao.peek();
                    if (f == '#') {
                        num.push(n);    //如果是#则表示不计算
                    } else {
                        int m = num.pop();
                        fuhao.pop();
                        num.push(daole(m, n));   //如果是$进行计算
                    }
                }
            } else {
                if (fuhao.isEmpty()) {
                    num.push(Integer.valueOf(str)); //上个str数字化push数字堆栈
                    str = "";   //重置str
                    fuhao.push(s.charAt(i));    //本次字符串push符合堆栈
                } else {
                    int n = Integer.valueOf(str);   //str数字化
                    char f = fuhao.peek();  //获取符号堆栈最上面的符号
                    str = "";   //重置str
                    if (f == '#') {
                        num.push(n);    //#先不计算
                    } else {
                        int m = num.pop();  //获取数字堆栈最上面的数字
                        fuhao.pop();    //移除符号堆栈最上面的符号
                        num.push(daole(m, n));   //计算完push数字堆栈
                    }
                    fuhao.push(s.charAt(i));    //将本次的符号push符号堆栈
                }
            }
        }

        int n = num.size();
        while (n > 1) {
            num.addLast(jinghao(num.pollLast(), num.pollLast()));    //剩下的数字直接进行#运算
            n--;
        }
        System.out.println(num.peek());
    }

    public static int jinghao(int x, int y) {
        return 2 * x + 3 * y + 4;
    }
    public static int daole(int x, int y) {
        return 3 * x + y + 2;
    }

}
