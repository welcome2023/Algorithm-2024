package com.algorithmtest.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 17:09
 * @usage
 */
public class Class04_IPO {
    /**
     * @param k:可以做几个项目
     * @param w:初始资金
     * @param profits:利润
     * @param capital:花费
     * @return
     */
    public static int findMaximizedCapital(int k,int w,int []profits,int []capital){
        PriorityQueue<Node> minCostQ = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> maxProfitQ = new PriorityQueue<>(new MaxProfitComparator());
        for (int i = 0; i < profits.length; i++) {
            minCostQ.add(new Node(profits[i],capital[i]));
        }
        for (int i = 0; i < k; i++) {
            while (!minCostQ.isEmpty()&&minCostQ.peek().c<=w){
                maxProfitQ.add(minCostQ.poll());
            }
            if(maxProfitQ.isEmpty()){
                return w;
            }
            w+=maxProfitQ.poll().p;
        }
        return w;
    }


    public static class Node{
        public int p;
        public int c;
        public Node(int p,int c){
            this.p=p;
            this.c=c;
        }
    }
    public static class MinCostComparator implements Comparator<Node>{
        @Override
        public int compare(Node o1, Node o2) {
            return o1.c-o2.c;
        }
    }

    public static class MaxProfitComparator implements Comparator<Node>{
        @Override
        public int compare(Node o1, Node o2) {
            return o2.p-o1.p;
        }
    }
}
