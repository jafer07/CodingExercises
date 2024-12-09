package com.coding.exercise;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotate(int[] nums, int k){
        int arrLen = nums.length;
        int[] temp = nums.clone();
        for (int i = 0; i < arrLen; i++) {
           if( (i+k) < arrLen) {
               nums[i+k] = temp[i];
           } else {
               nums[(i + k) % arrLen] = temp[i];
           }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
