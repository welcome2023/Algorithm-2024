package com.algorithmtest.greedy;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 17:21
 * @usage
 */
public class Class05_NQueens {
    public static int num1(int n){
        if(n<1){
            return 0;
        }
        int []record=new int[n];
        return process1(0,record,n);

    }

    private static int process1(int i, int[] record, int n) {
        if(i==n){
            return 1;
        }
        int res=0;
        for (int j = 0; j < n; j++) {
            if(isValid(record,i,j)){
                record[i]=j;
                res+=process1(i+!,record,n);
            }
        }
        return res;
    }

    private static boolean isValid(int[] record, int i, int j) {
        for (int k = 0; k < i; k++) {
            if(j==record[k]|| Math.abs(record[k]-j)==Math.abs(i-k)){
                return false;
            }
        }
        return true;
    }
    //  n<32
    public static int num2(int n){
        if(n<1||n>32){
            return 0;
        }
        int limit =n==32?-1:(1<<n)-1;
        return process2(limit ,0,0,0);
    }

    private static int process2(int limit, int colLim, int leftDiaLim, int rightDiaLim) {
        if(colLim==limit){
            return 1;
        }
        int mostRightOne=0;
        int pos=limit&(~(colLim|leftDiaLim|rightDiaLim));
        int res=0;
        while (pos!=0){
            mostRightOne =pos& (-pos+1);
            pos=pos-mostRightOne;
            res+=process2(limit,colLim|mostRightOne,(leftDiaLim|mostRightOne)<<1,(rightDiaLim|mostRightOne)>>>1);
        }
        return res;
    }
}
