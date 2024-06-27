package com.hwreal.day9.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-28 10:03
 * @usage
 */
public class Class01_Tree_SubTreeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        int index = 1;
        int result = 0;
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int num : nums) {
            int curNum=num;
            if (list.get(index / 2) != -1) {
                curNum = list.get(index / 2) + curNum;
            }
            list.add(curNum);
            index++;
            result = Math.max(result, curNum);
        }
            System.out.println(result);
    }
}




 /*   public static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Class02_Tree_SubTreeMax.TreeNode root = buildTree(nums, 1);
        dfs( root, 0);
        System.out.println(ans);
    }
    private static void dfs(Class02_Tree_SubTreeMax.TreeNode root, int sum) {
        if (root == null) {
            ans =  Math.max( ans, sum);
            return;
        }
        sum += root.val;
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    public static Class02_Tree_SubTreeMax.TreeNode buildTree(int[] nums, int index) {
        if (index > nums.length || nums[index - 1] == -1) {
            return null;
        }
        Class02_Tree_SubTreeMax.TreeNode root = new Class02_Tree_SubTreeMax.TreeNode(nums[index - 1]);
        root.left = buildTree(nums, index * 2);
        root.right = buildTree(nums, index * 2 + 1);
        return root;
    }
static class TreeNode {
    int val;
    Class02_Tree_SubTreeMax.TreeNode left;
    Class02_Tree_SubTreeMax.TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}*/
