package com.byelr;

/**
 * Created by liuchen on 16/6/10.
 */
public class Solution343 {

    public int func(int n,int[] a){
        if (a[n]!=-1){
            return a[n];
        }else{
            int max = -1;
            for (int i = 1;i<= n/2;i++){
                if(func(i,a) * func(n-i,a) > max){
                    max = func(i,a) * func(n-i,a);
                }
            }
            a[n] = max;
            return max;
        }
    }

    public int integerBreak(int n) {
        switch (n){
            case 1: return 0;
            case 2: return 1;
            case 3: return 2;
        }
        int [] a = new int[n+1];
        for(int i = 0;i<n+1;i++){
            a[i]= -1;
        }
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        return func(n, a);
    }

    public static void main(String[] args){
        System.out.println(new Solution343().integerBreak(20));
    }
}
