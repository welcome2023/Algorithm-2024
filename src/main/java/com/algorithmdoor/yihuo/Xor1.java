package com.algorithmdoor.yihuo;

/**
 * @createDate 2024-01-02 20:21
 * 需求:一个数组,只有一个数出现奇数次,其余均为偶数次,找出这个数
 */

public class Xor1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,2,4,1,5};
        System.out.println(findOne(arr));
    }
    public static int findOne(int []arr){
        int xor=0;
        for (int i : arr) {
            xor^=i;
        }
        return xor;
    }

}
