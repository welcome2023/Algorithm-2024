package com;

import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Tree2> list = new ArrayList<>();

        for (int i : arr) {
            Tree2 tree = new Tree2(i, 1);
            list.add(tree);
        }

        while (list.size() > 1) {
            Collections.sort(list);
            Tree2 first = list.remove(0);
            Tree2 second = list.remove(0);
            int maxHeight=Math.max(first.height,second.height);
            Tree2 tree = new Tree2(first, second, first.value + second.value, maxHeight + 1);
            list.add(tree);
        }

        StringBuilder sb = new StringBuilder();
        dfs(sb,list.get(0));
        System.out.print(sb);


    }

    private static void dfs(StringBuilder sb, Tree2 tree) {
        if(tree==null){
            return;
        }
        dfs(sb,tree.left);
        sb.append(tree.value).append(" ");
        dfs(sb,tree.right);
    }
}

// 按照要求定义二叉树

class Tree2 implements Comparable<Tree2> {
    int value;
    Tree2 left;
    Tree2 right;
    int height;

    public Tree2(int value) {
        this.value = value;
    }

    public Tree2(int value, int hei) {
        this.value = value;
        this.height = hei;
    }

    public Tree2(Tree2 left,Tree2 right,int value,int height){
        this.left=left;
        this.right=right;
        this.value=value;
        this.height=height;
    }


    @Override
    public int compareTo(Tree2 o) {
        return o.value == this.value ? this.height - o.height : this.value - o.value;
    }
}


