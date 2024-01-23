package com;


import java.util.PriorityQueue;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
public class Test {
   public static void main(String[] args) {
       int[] arr = {1, 4, 2, 6, 8, 5, 3, 2};

       sortedArrDistanceLessK(arr,5);

      for (int i : arr) {
         System.out.println(i);
      }

   }

   private static void sortedArrDistanceLessK(int[] arr, int k) {
      PriorityQueue<Integer> heap = new PriorityQueue<>();
       int index=0;
      for (; index < Math.max(arr.length,k); index++) {
         heap.add(arr[index]);
      }
      int i=0;
      for (; index< arr.length; i++,index++) {
         heap.add(arr[index]);
         arr[i]=heap.poll();
      }

      while (!heap.isEmpty()){
         arr[i++]=heap.poll();
      }
   }


}