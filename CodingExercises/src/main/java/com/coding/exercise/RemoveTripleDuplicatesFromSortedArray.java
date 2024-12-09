package com.coding.exercise;

public class RemoveTripleDuplicatesFromSortedArray {
    public static int removeTripleDuplicates(int[] nums) {
        int numberOfUniqueElements = 0;
        boolean isDuplicated = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[numberOfUniqueElements] && !isDuplicated){
                numberOfUniqueElements++;
                nums[numberOfUniqueElements] = nums[i];
                isDuplicated = true;
            } else if (nums[i] != nums[numberOfUniqueElements]) {
                numberOfUniqueElements++;
                nums[numberOfUniqueElements] = nums[i];
                if (isDuplicated){
                    isDuplicated = false;
                }
            }
        }
        numberOfUniqueElements++;
        return numberOfUniqueElements;
    }
}
