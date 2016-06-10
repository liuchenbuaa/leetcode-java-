package com.byelr;

/**
 * Created by liuchen on 16/6/10.
 */
public class Solution338 {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        result[0] = 0;
        if(num == 0){
            return result;
        }
        for(int i = 1;i <= num ; i++){
            int j = 1;
            while(j * 2 <= i){
                j = j * 2;
            }
            result[i] = result[i-j] + 1;
        }
        return result;
    }

    public static void main(String[] args){
        int[] result = new Solution338().countBits(16);
        for(int i=0;i< result.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
