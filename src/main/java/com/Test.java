package com;




/**
 * @createDate 2023-12-25 22:52
 */
public class Test {
    public static void main(String[] args) {
        int []arr={3,5,7,2};
    }

    public static void process(int []arr,int tmp){
        int []help=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=tmp){

                help[j++]=arr[i];
            }else {

            }
        }

    }
    public static void swap(int []arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
