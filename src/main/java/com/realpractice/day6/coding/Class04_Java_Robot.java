package com.realpractice.day6.coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-22 23:38
 * @usage
 */
public class Class04_Java_Robot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取并解析输入为整型数组
        int[] taskTimes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 输入验证：任务数量超过8则无法安排
        if (taskTimes.length > 8) {
            System.out.println(-1);
            return;
        }

        // 初始化搜索区间：最小时间（平均分配）与最大时间（单个任务最长）
        int minTimeNeeded = Arrays.stream(taskTimes).sum() / 8;
        int maxPossibleTime = Arrays.stream(taskTimes).max().orElse(0);// orElse防御性编程习惯

        // 二分查找合适的最短完成时间
        while (minTimeNeeded < maxPossibleTime) {
            int candidateTime = (minTimeNeeded + maxPossibleTime) / 2;

            // 计算在candidateTime下的总天数
            int totalDays = 0;
            for (int taskTime : taskTimes) {
                totalDays += (taskTime / candidateTime) + (taskTime % candidateTime != 0 ? 1 : 0);
            }

            // 调整搜索区间
            if (totalDays > 8) {
                minTimeNeeded = candidateTime + 1;
            } else {
                maxPossibleTime = candidateTime;
            }
        }

        // 输出结果：找到的最短时间
        System.out.println(minTimeNeeded);

    }
}
