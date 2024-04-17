package com.realpractice.day1.coding;

/**
 * @author cmsxyz@163.com
 * @date 2024-04-15 0:13
 * @usage
 */
public class Class03_Window_BuyGem {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 1, 8, 9, 3, 2, 4};
        System.out.println(getRes(arr, 15));
    }

    public static int getRes(int[] arr, int money) {
        if (arr == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > money) {
                    break;
                }
                count = Math.max(count, j - i + 1);
            }
        }
        return count;
    }

    public static int getRes1(int[] arr, int money) {
        if (arr == null) {
            return 0;
        }
        int left = 0, right = 0, count = 0, sum = 0;
        while (right < arr.length) {
            sum+=arr[right];
            if(sum<=money){
                count = Math.max(count, right - left + 1);
            }else {
                sum-=arr[left];
                left++;
            }
            right++;
        }
        return count;
    }
}
