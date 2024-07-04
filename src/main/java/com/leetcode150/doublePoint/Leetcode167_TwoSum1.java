package com.leetcode150.doublePoint;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 17:32
 * @usage 判断是否是子序列
 */
public class Leetcode167_TwoSum1 {
    public static void main(String[] args) {
        Leetcode167_TwoSum1 obj = new Leetcode167_TwoSum1();
        for (int i : obj.twoSum(new int[]{1, 2, 3}, 4)) {
            System.out.print(i + " ");
        }
    }

    public int[] twoSum(int[] numbers, int target) {
      int left=0,right=numbers.length-1;
      while (left<right){
          int sum=numbers[left]+numbers[right];
          if(sum<target){
              left++;
          } else if (sum>target) {
              right--;
          }else {
              return new int[]{++left,++right};
          }
      }
      return null;
    }


}
