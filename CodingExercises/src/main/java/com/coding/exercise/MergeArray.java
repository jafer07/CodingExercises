package com.coding.exercise;

import java.util.Arrays;

public class MergeArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstIndex = m-1;
        int secondIndex = n-1;
        for (int i = (m+n-1); i >= 0; i--) {
            if (firstIndex < 0){
                nums1[i] = nums2[secondIndex];
                secondIndex--;
            } else if (secondIndex < 0 || nums1[firstIndex] >= nums2[secondIndex]){
                nums1[i] = nums1[firstIndex];
                firstIndex--;
            } else {
                nums1[i] = nums2[secondIndex];
                secondIndex--;
            }
        }
        System.out.println("final array ::: " + Arrays.toString(nums1));
    }
}
