package com;

import java.util.*;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] que = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] res = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        Deque<Integer> heap = new ArrayDeque<>();
        int left = 0;
        for (int i = 0; i < que.length; i++) {
            heap.push(que[i]);
            while (!heap.isEmpty() && (heap.peekLast() == res[left] || heap.peekFirst() == res[left])) {
                if(i==que.length-1&&heap.size()==1){
                    heap.pollLast();
                    sb.append("L");
                }else if(heap.peekFirst() == res[left]){
                    heap.pollFirst();
                    sb.append("R");
                } else {
                    heap.pollLast();
                    sb.append("L");
                }
                left++;
            }
        }
        System.out.println(sb.length()==que.length?sb:"NO");
    }
}
