package com;



/**
 * @createDate 2023-12-25 22:52
 */
public class Test {
    public static void main(String[] args) {
        int[]arr={1,2,4,6,2,4,5,3,2};
        process(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void  process(int []arr,int l,int r){
        if(l==r){
            return;
        }

        int mid=l+((r-l)>>1);
        process(arr,l,mid);
        process(arr,mid+1,r);

        merge(arr,l,mid,r);

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int p1=l;
        int p2=m+1;
        int i=0;
        int []help=new int[r-l+1];
        while (p1<=m&&p2<=r){
            help[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=m){
            help[i++]=arr[p1++];
        }
        while (p2<=r){
            help[i++]=arr[p2++];
        }
        for ( i = 0; i < help.length; i++) {
            arr[l+i]=help[i];
        }
    }
}
