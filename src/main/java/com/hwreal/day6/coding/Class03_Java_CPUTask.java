package com.hwreal.day6.coding;

import java.util.Scanner;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-22 21:47
 * @usage
 */
public class Class03_Java_CPUTask {
    public static void main(String[] args) {
        // 初始化扫描器来读取输入
        Scanner scanner = new Scanner(System.in);
        // 读取CPU每单位时间能处理的任务数
        int taskCapacity = scanner.nextInt();
        // 读取任务总数
        int totalTasks = scanner.nextInt();
        // 创建数组存储每个任务的耗时
        int[] taskDurations = new int[totalTasks];
        // 填充任务耗时数组
        for (int i = 0; i < totalTasks; i++) {
            taskDurations[i] = scanner.nextInt();
        }
        // 初始化时间计数器和溢出时间
        int totalTime = 0;
        int overflowTime = 0;
        // 遍历任务，计算完成所有任务所需时间
        for (int duration : taskDurations) {
            // 如果当前任务加上之前累积的溢出时间超过CPU一单位时间的处理能力
            if (duration + overflowTime > taskCapacity) {
                // 更新溢出时间为当前任务超出的部分
                overflowTime = duration + overflowTime - taskCapacity;
            } else {
                // 如果不超载，清零溢出时间
                overflowTime = 0;
            }
            // 每处理一个任务（或其一部分），时间计数器加一
            totalTime++;
        }
        // 处理剩余的溢出时间
        while (overflowTime > 0) {
            // 减少溢出时间，并增加总时间
            overflowTime -= taskCapacity;
            totalTime++;
        }
        // 输出总时间
        System.out.println(totalTime);
    }
}