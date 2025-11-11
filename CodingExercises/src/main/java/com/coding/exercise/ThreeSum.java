package com.coding.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){
        if (nums.length < 3 || nums.length > 3000){
            throw new IllegalArgumentException("invalid argument error");
        }
        List<List<Integer>> result = new ArrayList<>();
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        for (int i = 0; i < sortedNums.length-2; i++) {
            if (i > 0 && sortedNums[i] == sortedNums[i-1]){
                continue;
            }
            int head = i+1, tail=sortedNums.length-1;
            while (head < tail){
                int currentSum = sortedNums[i] + sortedNums[head] + sortedNums[tail];
                if (currentSum == 0){
                    result.add(List.of(sortedNums[i], sortedNums[head], sortedNums[tail]));
                    int headVal = sortedNums[head], tailVal = sortedNums[tail];
                    while(head < tail && sortedNums[head] == headVal){
                        head++;
                    }
                    while (head < tail && sortedNums[tail] == tailVal){
                        tail--;
                    }
                } else if (currentSum < 0){
                    head++;
                } else {
                    tail--;
                }
            }
        }
        return result;
    }
}
