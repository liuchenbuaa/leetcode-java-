package com.byelr;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by liuchen on 16/6/10.
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] result = new int[length1< length2? length1 :length2];
        if(length1 == 0 || length2 == 0){
            return result;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else {
                result[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(result,k);
    }

    public static void main(String[] args){
        int[] a = {9,9,8,8,7,7,1,2,3,4};
        int[] b = {9,9,8,8,7,7,0,0,0,0,0};
        int[] result = new Solution350().intersect(a,b);
        for (int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + ",");
        }
    }
}
