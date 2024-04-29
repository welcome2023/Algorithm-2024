package com.realpractice.day8.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 0:10
 * @usage
 */
public class Class04_Graph_MinSpend {
    public static int findRoot(int x, int[] parent) {
        while (x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    public static boolean getUnion(int a, int b, int[] parent) {
        a = findRoot(a, parent);
        b = findRoot(b, parent);
        if (a == b)return false;
        parent[a] = b;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int x, y, z, p;
        int[] parent = new int[N + 1];
        List<int[]> roads = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < M; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            p = in.nextInt();
            if (p == 1) {
                getUnion(x, y, parent);
            } else {
                int [] node = new int[3];
                node[0] = x;
                node[1] = y;
                node[2] = z;
                roads.add(node);
            }
        }
        int f1 = -1;
        boolean flag = true;
        for (int i = 1; i <= N; ++i) {
            int root = findRoot(i, parent);
            if (f1 == -1) {
                f1 = root;
            } else if (f1 != root) {
                flag = false;
            }
        }
        int result = 0;
        if (flag) {
            System.out.println(0);
            return;
        }
        for (int [] edge : roads) {
            if (getUnion(edge[0], edge[1], parent)) {
                result += edge[2];
            }
            boolean flag1 = true;
            f1=-1;
            for (int i = 1; i <= N; ++i) {
                int root = findRoot(i, parent);
                if (f1 == -1) {
                    f1 = root;
                } else if (f1 != root) {
                    flag1 = false;
                }
            }
            if (flag1) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
