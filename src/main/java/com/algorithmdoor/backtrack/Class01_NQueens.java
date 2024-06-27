package com.algorithmdoor.backtrack;

/**
 * @author cmsxyz@163.com
 * @date 2024-03-02 17:21
 * @usage
 */
public class Class01_NQueens {
    public static void main(String[] args) {
        System.out.println(num1(4));
    }
    public static int num1(int n){
        if(n<1){
            return 0;
        }
        int []record=new int[n];
        return process1(0,record,n);

    }

    /**
     *
     * @param i 目前来到了第i行
     * @param record 表示之前的行,存储皇后的位置,一定不共行,不共列,不共斜线
     * @param n 是n*n的棋盘
     * @return 返回最终的摆法数
     */
    private static int process1(int i, int[] record, int n) {
        // n是终止行,棋盘的下一行,棋盘的第一行是从数组索引0开始的
        if(i==n){
            return 1;
        }
        int res=0;
        for (int j = 0; j < n; j++) {
            if(isValid(record,i,j)){
                record[i]=j;
                res+=process1(i+1,record,n);
            }
        }
        return res;
    }
    // i 行   j  列  record 所有的结果
    private static boolean isValid(int[] record, int i, int j) {
        for (int k = 0; k < i; k++) {
            if(j==record[k]|| Math.abs(record[k]-j)==Math.abs(i-k)){
                return false;
            }
        }
        return true;
    }


















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
