package com;


/**
 * @createDate 2023-12-25 22:52
 */
public class Test {
    public static void main(String[] args) {
        int []arr={1,4,2,3,6,7,8,99,100};
        System.out.println(process(arr, 0, arr.length - 1));
    }

   public static int process(int []arr,int l,int r){
       if(l==r){
           return arr[l];
       }

       int mid =l+((r-l)>>1);
       int leftMax=process(arr,l,mid);
       int rightMax=process(arr,mid+1,r);
       return Math.max(leftMax,rightMax);
   }

}
