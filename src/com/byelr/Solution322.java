package com.byelr;

/**
 * Created by liuchen on 16/6/11.
 */
public class Solution322 {

    int[] t;

    public int getMinCount(int[] coins,int amount){
        if(amount==0){
            return 0;
        }else if (amount < 0){
            return -1;
        }else if(t[amount]!= -2){
            return t[amount];
        }else{
            boolean flag = false;
            int min = 0;
            for(int i =0;i<coins.length;i++){
                int count = getMinCount(coins,amount-coins[i]);
                if(count!= -1){
                    if(flag == false || 1+count < min){
                        min = count + 1;
                        flag = true;
                    }
                }
            }
            if(flag){
                t[amount] = min;
            }else{
                t[amount] = -1;
            }
            return t[amount];
        }
    }

    public int coinChange(int[] coins, int amount) {
        t = new int[amount+1];
        for(int i = 0;i<=amount;i++){
            t[i]= -2;
        }
        return getMinCount(coins, amount);
    }

    public static void main(String[] args){
        int[] coins = {11,4,5};
        int a = 9;
        System.out.print(new Solution322().coinChange(coins,a));
    }
}
