package com.leetcode150.hashTable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author cmsxyz@163.com
 * @date 2024/5/31 10:09
 * @usage
 */
public class Leetcode202_IsHappy {
    public static void main(String[] args) {
        Leetcode202_IsHappy obj = new Leetcode202_IsHappy();
        System.out.println(obj.isHappy(2));

    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNum(n);
        }
        return n == 1;
    }

    public int getNum(int n) {
        int res = 0;
        while (n > 0) {
            int a = n % 10;
            res += a * a;
            n /= 10;
        }

        return res;
    }
}


