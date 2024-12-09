package com.coding.exercise;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int numberOfUniqueElements = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[numberOfUniqueElements]) {
                numberOfUniqueElements++;
                nums[numberOfUniqueElements] = nums[i];
            }
        }
        numberOfUniqueElements++;
        return numberOfUniqueElements;
    }
}