package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @createDate 2023-12-25 22:52
 * getMax
 */
// CBEFDA CBAEDF

public class Test {
    static int max = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int money = arr[1];
        int danger = arr[2];
        int[] huibaolv = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] fengxian = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] touzie = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (fengxian[i] <= danger && touzie[i] <= money) {
                sum = touzie[i] * huibaolv[i];
            }
            if (sum > max) {
                max = sum;
                Arrays.fill(res, 0);
                res[i] = touzie[i];
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                if (fengxian[i]+fengxian[j]<=danger&&touzie[i]+touzie[j]<=money) {
                    sum+=touzie[i]*huibaolv[i];
                    sum+=touzie[j]*huibaolv[j];
                    if(sum>max){
                        max=sum;
                        Arrays.fill(res,0);
                        res[i]=touzie[i];
                        res[j]=touzie[j];
                    }
                } else if (fengxian[i]+fengxian[j]<=danger&&touzie[i]+touzie[j]>money) {
                    int sum2=0;
                    int value=0;
                    int cha=touzie[i]+touzie[j]-money;
                    for (int k = 0; k < cha; k++) {
                        if(touzie[i]-k>0&&touzie[j]-(cha-k)>0){
                            sum2+=(touzie[i]-k)*huibaolv[i];
                            sum2+=(touzie[j]-(cha-k))*huibaolv[j];
                        }
                        if(sum2>sum){
                            sum=sum2;
                            value=k;
                        }
                    }
                    if(sum>max){
                        max=sum;
                        Arrays.fill(res,0);
                        res[i]=touzie[i]-value;
                        res[j]=touzie[j]-(cha-value);
                    }
                }
            }
        }

        for (int re : res) {
            System.out.print(re+" ");
        }


    }

}


